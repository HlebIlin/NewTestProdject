package PageObjects.MegogoHomePageWebElements;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageFimsWithTitleSe7en extends BasePage {
    public HomePageFimsWithTitleSe7en(WebDriver driver) {
        super(driver);
    }

    public WebElement getFilmSimBtn() {
        return getElementByXpath("//div[@data-tracker-object-title='Сім']");
    }
}
