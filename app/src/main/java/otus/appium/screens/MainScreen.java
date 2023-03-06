package otus.appium.screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.time.Duration;

public class MainScreen {
    private AndroidDriver driver;

    @FindBy(id = "ru.skoda.service:id/cardViewTwoHelpOnTheRoad")
    private WebElement elHelpOnRoad;

    public MainScreen(AndroidDriver driver) {
        PageFactory
                .initElements(
                        new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
        this.driver = driver;
    }

    public MainScreen clickHelpOnRoad() {
        elHelpOnRoad
                .click();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return this;
    }
}
