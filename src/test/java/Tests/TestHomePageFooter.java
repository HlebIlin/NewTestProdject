package Tests;

import PageObjects.MegogoHomePageWebElements.MegogoHomePageFooterWebElements;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageFooter extends TestInit {
    @Test
    public void testHomePageFooter() {
        MegogoHomePageFooterWebElements megogoHomePageFooterWebElements = new MegogoHomePageFooterWebElements(driver);

        fullScreen();
        goToMegogo();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");

        Assert.assertTrue(megogoHomePageFooterWebElements.getAllAboutSubscriptionsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageFooterWebElements.getBonusAndSurpriseBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageFooterWebElements.getMegogoTogetherForWeBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageFooterWebElements.getActivePromoCodeBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageFooterWebElements.getDealBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageFooterWebElements.getAgreementPrivacyBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageFooterWebElements.getRemoveProfileBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageFooterWebElements.getLoyaltyRules().isDisplayed());
        Assert.assertTrue(megogoHomePageFooterWebElements.getAppStoreAppleBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageFooterWebElements.getAppTelegramBtn().isDisplayed());
    }
}
