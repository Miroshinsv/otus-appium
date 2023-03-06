package otus.appium.factory;

import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileCapabilities {
    public static DesiredCapabilities getAndroidCapabilities() {
        var cap = new DesiredCapabilities();
        cap.setPlatform(Platform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
        cap.setCapability(MobileCapabilityType.APP, "/Users/miroshinsergey/Downloads/skoda.apk");
        return cap;
    }
}
