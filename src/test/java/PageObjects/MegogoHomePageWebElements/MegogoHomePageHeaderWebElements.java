package PageObjects.MegogoHomePageWebElements;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MegogoHomePageHeaderWebElements extends BasePage {

    public MegogoHomePageHeaderWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getMegogoIconBtn() {
        return getElementByXpath("//div[@class='header-logo']");
    }

    public WebElement getTVChannelsBtn() {
        return getElementByXpath("//li[@data-menu-id='14731'][@class='menu-item dropdown--hover product-main ']");
    }

    public WebElement getFilmsBtn() {
        return getElementByXpath("//li[@data-menu-id='14751'][@class='menu-item dropdown--hover product-main ']");
    }

    public WebElement getCartoonsBtn() {
        return getElementByXpath("//li[@data-menu-id='14761'][@class='menu-item dropdown--hover product-main ']");
    }

    public WebElement getSerialsBtn() {
        return getElementByXpath("//li[@data-menu-id='25421'][@class='menu-item dropdown--hover product-main ']");
    }

    public WebElement getShowsBtn() {
        return getElementByXpath("//li[@data-menu-id='22081'][@class='menu-item dropdown--hover product-main ']");
    }

    public WebElement getSportBtn() {
        return getElementByXpath("//a[@class='dropdown-toggle menu-link'][@href='https://megogo.net/ua/sport/main']");
    }

    public WebElement getBloggersBtn() {
        return getElementByXpath("//li[@data-menu-id='37215'][@class='menu-item dropdown--hover product-main ']");
    }

    public WebElement getOthersBtn() {
        return getElementByXpath("//li[@data-menu-id='14791']");
    }

    public WebElement getTariffsBtn() {
        return getElementByXpath("//a[@class='btn bordered try-and-buy-btn jsTryAndBuyBtn']");
    }

    public WebElement getSearchBtn() {
        return getElementByXpath("//button[@class='form-submit']");
    }

    public WebElement getLanguageBtn() {
        return getElementByXpath("//a[@class='dropdown-toggle languages-toggle']");
    }

    public WebElement getLogInBtn() {
        return getElementByXpath("//a[@class='link-white header-auth-link jsAuthByTemplate']");
    }
}
