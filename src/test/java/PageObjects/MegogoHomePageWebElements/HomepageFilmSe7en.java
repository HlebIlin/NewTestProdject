package PageObjects.MegogoHomePageWebElements;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomepageFilmSe7en extends BasePage {
    public HomepageFilmSe7en(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> yesToMe18() {
        return getElementsByXpath("//button[@data-age-limit='false']");
    }

    public List<WebElement> getWatchBtn() {
        return getElementsByXpath("//span[@data-current-text='Дивитися']");
    }

}
