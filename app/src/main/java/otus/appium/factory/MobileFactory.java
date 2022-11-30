package otus.appium.factory;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileFactory {
    public static AndroidDriver getAndroidDriver() {
        try {
            var url = new URL("http://localhost:4723/wd/hub");
            return new AndroidDriver(url, MobileCapability.getAndroidMobileCapability());
        } catch (MalformedURLException e) {
            new RuntimeException(e);
        }
        throw new RuntimeException("unknown state");
    }
}
