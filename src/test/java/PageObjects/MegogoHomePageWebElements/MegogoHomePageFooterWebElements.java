package PageObjects.MegogoHomePageWebElements;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MegogoHomePageFooterWebElements extends BasePage {

    public MegogoHomePageFooterWebElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getAllAboutSubscriptionsBtn() {
        return getElementByXpath("//a[@class='link-gray'][@href='https://megogo.net/ua/kino_i_tv']");
    }

    public WebElement getBonusAndSurpriseBtn() {
        return getElementByXpath("//a[@class='link-gray'][@href='https://megogo.net/ua/loyalty']");
    }

    public WebElement getMegogoTogetherForWeBtn() {
        return getElementByXpath("//a[@class='link-gray'][@href='https://megogo.net/ua/research_takepart']");
    }

    public WebElement getActivePromoCodeBtn() {
        return getElementByXpath("//a[@class='link-gray'][@href='https://megogo.net/ua/code']");
    }

    public WebElement getDealBtn() {
        return getElementByXpath("//a[@class='link-gray'][@href='https://megogo.net/ua/rules']");
    }

    public WebElement getAgreementPrivacyBtn() {
        return getElementByXpath("a[@class='link-gray'][@href='https://megogo.net/ua/rules#agreement-privacy']");
    }

    public WebElement getRemoveProfileBtn() {
        return getElementByXpath("//a[@class='link-gray'][@href='https://megogo.net/ua/deleting_profile']");
    }

    public WebElement getLoyaltyRules() {
        return getElementByXpath("//a[@class='link-gray'][@href='https://megogo.net/ua/loyalty_rules']");
    }

    public WebElement getAppStoreAppleBtn() {
        return getElementByXpath("//img[@alt='Додатки в App Store']");
    }

    public WebElement getAppTelegramBtn() {
        return getElementByXpath("//a[@title='Telegram']");
    }
}
