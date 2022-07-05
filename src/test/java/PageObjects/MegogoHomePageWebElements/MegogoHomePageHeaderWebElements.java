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

    //SPORT SECTION

    public WebElement getTennisBtn() {
        return getElementByXpath("//span[contains(text(),'Теніс')]");
    }

    public WebElement getFootballBtn() {
        return getElementByXpath("//span[contains(text(),'Футбол')]");
    }

    public WebElement getCombatSportBtn() {
        return getElementByXpath("//span[contains(text(),'Єдиноборства')]");
    }

    public WebElement getMoreSportBtn() {
        return getElementByXpath("//span[contains(text(),'Більше спорту')]");
    }

    //OTHER SECTION

    public WebElement getOnlineSchoolBtn() {
        return getElementByXpath("//li[@data-menu-id='35965']");
    }

    public WebElement getEnterPromoCodeBtn() {
        return getElementByXpath("//span[contains(text(),'Ввести промокод')]");
    }

    public WebElement getGiftsBtn() {
        return getElementByXpath("//span[contains(text(),'Подарунки')]");
    }

    public WebElement getAudiobooksAndPodcastsBtn() {
        return getElementByXpath("//span[contains(text(),'Аудіокниги та подкасти')]");
    }

    public WebElement getLinkTVBtn() {
        return getElementByXpath("//a[@href='https://megogo.net/ua/profile#profileDevices'][@class='submenu-link']");
    }

    public WebElement getAllAboutSubscriptionBtn() {
        return getElementByXpath("//li[@data-menu-id='14841']");
    }

    public WebElement getBonusesBtn() {
        return getElementByXpath("//li[@data-menu-id='14801']");
    }

    public WebElement getCashbackBtn() {
        return getElementByXpath("//span[contains(text(),'Кешбек')]");
    }

    public WebElement getBeneficenceBtn() {
        return getElementByXpath("//span[contains(text(),'Благодійність')]");
    }

    public WebElement getSubscriptionForEstablishmentsBtn() {
        return getElementByXpath("//li[@data-menu-id='53195']");
    }

    public WebElement getMegogoSetTopBoxBtn() {
        return getElementByXpath("//li[@data-menu-id='32625']");
    }

    public WebElement getMegogoOnDevicesBtn() {
        return getElementByXpath("//li[@data-menu-id='14811']");
    }

    public WebElement getMoviesBySubscriptionBtn() {
        return getElementByXpath("//li[@data-menu-id='15641']");
    }

    public WebElement getTrailersBtn() {
        return getElementByXpath("//li[@data-menu-id='31675']");
    }

    public WebElement getDiscoveryBtn() {
        return getElementByXpath("//li[@data-menu-id='41685']");
    }

    public WebElement getLookHowItsHeardBtn() {
        return getElementByXpath("//li[@data-menu-id='17851']");
    }

    public WebElement getSelectionsBtn() {
        return getElementByXpath("//li[@data-menu-id='15341']");
    }

    public WebElement getMegogoPokerBtn() {
        return getElementByXpath("//li[@data-menu-id='38205']");
    }

    public WebElement getHBOBtn() {
        return getElementByXpath("//li[@data-menu-id='16081']");
    }
}
