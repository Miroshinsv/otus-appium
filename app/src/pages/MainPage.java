package otus.appium.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class MainPage {
    private final static String BUTTONS = "//android.view.ViewGroup/android.widget.FrameLayout";
    private final AppiumDriver driver;
    @AndroidFindBy(xpath = BUTTONS)
    private List<MobileElement> elButtonsList;


    public MainPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
        this.driver = driver;
    }

    public MainPage selectRandomButton() {
        elButtonsList.get(new Random().nextInt(elButtonsList.size() - 1)).click();
        return this;
    }
}
