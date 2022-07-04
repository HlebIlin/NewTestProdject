package Tests;

import PageObjects.MegogoHomePageWebElements.MegogoHomePageHeaderWebElements;
import PageObjects.MegogoHomePageWebElements.MegogoTariffsHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageTariffs extends TestInit {

    @Test
    public void TestHomePageTariffs() {
        MegogoHomePageHeaderWebElements megogoHomePageHeaderWebElements = new MegogoHomePageHeaderWebElements(driver);
        MegogoTariffsHomePage megogoTariffsHomePage = new MegogoTariffsHomePage(driver);

        fullScreen();
        goToMegogo();
        megogoHomePageHeaderWebElements.getTariffsBtn().click();
        Assert.assertTrue(megogoTariffsHomePage.getConnectLightTariffBtn().isDisplayed());
        Assert.assertTrue(megogoTariffsHomePage.getConnectOptimalTariffBtn().get(0).isDisplayed());
        Assert.assertTrue(megogoTariffsHomePage.getConnectMaximumTariffBtn().get(0).isDisplayed());
        Assert.assertTrue(megogoTariffsHomePage.getLearnMoreAboutSubscriptions().isDisplayed());
        Assert.assertTrue(megogoTariffsHomePage.getCompletedPromotionBtn().isDisplayed());
        Assert.assertTrue(megogoTariffsHomePage.getGooglePlayBtn().isDisplayed());
    }
}
