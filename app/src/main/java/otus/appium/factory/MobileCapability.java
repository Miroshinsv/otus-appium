package otus.appium.factory;

import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileCapability {
    public static DesiredCapabilities getAndroidMobileCapability(){
        var desCap =  new DesiredCapabilities();
        desCap.setPlatform(Platform.ANDROID);
        desCap.setCapability("appium:deviceName", "emulator-5554");
        desCap.setCapability("appium:automationName", AutomationName.APPIUM);
        desCap.setCapability("appium:app", "/Users/miroshinsergey/Downloads/skoda.apk");
        return desCap;
    }
}
