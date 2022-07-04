package PageObjects.MegogoHomePageWebElements;

import PageObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MegogoTariffsHomePage extends BasePage {
    public MegogoTariffsHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getConnectLightTariffBtn() {
        return getElementByXpath("//a[@data-kibana_message='landing_button_light']");
    }

    public List<WebElement> getConnectOptimalTariffBtn() {
        return getElementsByXpath("//a[@data-kibana_message='landing_button_opt']");
    }

    public List<WebElement> getConnectMaximumTariffBtn() {
        return getElementsByXpath("//a[@data-kibana_message='landing_button_max']");
    }

    public WebElement getLearnMoreAboutSubscriptions() {
        return getElementByXpath("//span[contains(text(),'Детальніше про передплати')]");
    }

    public WebElement getCompletedPromotionBtn() {
        return getElementByXpath("//div[@class='compare_draw-select-item compare_draw-select-item_end']");
    }

    public WebElement getGooglePlayBtn() {
        return getElementByXpath("//img[@src='//s3.vcdn.biz/static/f/2841437171/3.png']");
    }
}
