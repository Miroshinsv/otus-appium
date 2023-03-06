package otus.appium;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import otus.appium.factory.MobileFactory;
import otus.appium.screens.MainScreen;

public class test001 {
    private AndroidDriver driver;
    private MainScreen mainScreen;

    @BeforeMethod
    public void setUp(){
        driver = MobileFactory.getAndroidDriver();
        mainScreen = new MainScreen(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test01(){
        mainScreen
                .clickHelpOnRoad();
    }
}
