package PageObjects.MegogoHomePageWebElements;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageFilmsWithTitleSe7en extends BasePage {
    public HomePageFilmsWithTitleSe7en(WebDriver driver) {
        super(driver);
    }

    public WebElement getFilmSimBtn() {
        return getElementByXpath("//div[@data-tracker-object-title='Сім']");
    }
}
