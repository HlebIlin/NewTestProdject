package PageObjects.MegogoHomePageWebElements;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MegogoHomePageBodyWebElements extends BasePage {

    public MegogoHomePageBodyWebElements(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getNewsWindowBtnLeft() {
        return getElementsByXpath("//img[@aria-hidden='true']");
    }

    public List<WebElement> getNewsWindowBtnRight() {
        return getElementsByXpath("//img[@aria-hidden='true']");
    }

    public List<WebElement> getTariffBtn() {
        return getElementsByXpath("//a[@href='/ua/kino_i_tv?utm_source=megogo&utm_medium=mainpage&utm_campaign=sravnenie_tariffs']");
    }

    public List<WebElement> getFilmsBtn() {
        return getElementsByXpath("//a[@href='/ua/films/main?utm_source=megogo&utm_medium=mainpage&utm_campaign=films']");
    }

    public List<WebElement> getMultFilmsBtn() {
        return getElementsByXpath("//a[@href='/ua/mult/main?utm_source=megogo&utm_medium=mainpage&utm_campaign=mult']");
    }

    public List<WebElement> getPremiersBtn() {
        return getElementsByXpath("//a[@href='/ua/premiere/main?utm_source=megogo&utm_medium=mainpage&utm_campaign=premiere']");
    }

    public WebElement getNowTVBtn() {
        return getElementByXpath("//*[@id='widget_88']");
    }

    public WebElement getPremiersCategoriesBtn() {
        return getElementByXpath("//a[@href='/ua/collection/premier']");
    }

    public WebElement getPopularBtn() {
        return getElementByXpath("//*[contains(text(),'Популярне')]");
    }

    public WebElement getNewInSubscriptionBtn() {
        return getElementByXpath("//*[contains(text(),'Нове в передплаті')]");
    }

    public WebElement getGrabForWeekendBtn() {
        return getElementByXpath("//*[contains(text(),'Встигнути за вихідні')]");
    }

    public WebElement getWhatLookNowBtn() {
        return getElementByXpath("//*[contains(text(),'Що зараз шукають')]");
    }

    public WebElement getChooseCategoriesBtn() {
        return getElementByXpath("//div[@id='widget_88PromoSlides_169656']");
    }

    public WebElement getSubscriptionTryBy1UahBtn() {
        return getElementByXpath("//a[@class='btn type-fill try-btn']");
    }

    public WebElement getTop5FilmsBtn() {
        return getElementByXpath("//a[@href='/ua?collection_top_id=34521']");
    }

    public WebElement getSerialAndShowBtn() {
        return getElementByXpath("//a[@href='/ua?collection_top_id=34541']");
    }

    public WebElement getCartoonBtn() {
        return getElementByXpath("//a[@href='/ua?collection_top_id=34531']");
    }
}
