package otus.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import otus.appium.factory.MobileFactory;
import otus.appium.pages.MainPage;

public class test001 {
    private MainPage mainPage;
    private AppiumDriver<MobileElement> driver;

    @BeforeMethod
    public void setUp() {
        driver = MobileFactory.getAndroidDriver();
        mainPage = new MainPage(driver);
    }

    @Test
    public void someTest() {
        mainPage
                .selectRandomButton();
    }
}
