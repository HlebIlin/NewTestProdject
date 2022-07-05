package Tests;

import PageObjects.MegogoHomePageWebElements.MegogoHomePageHeaderWebElements;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageHeaderSection extends TestInit {

    @Test
    public void testHomePageHeaderSportSection() {
        MegogoHomePageHeaderWebElements megogoHomePageHeaderWebElements = new MegogoHomePageHeaderWebElements(driver);
        Actions action = new Actions(driver);

        goToMegogo();
        fullScreen();
        action.moveToElement(megogoHomePageHeaderWebElements.getSportBtn());
        action.perform();
        Assert.assertTrue(megogoHomePageHeaderWebElements.getTennisBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getFootballBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getCombatSportBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getMoreSportBtn().isDisplayed());
    }

    @Test
    public void testHomePageHeaderOtherSection() {
        MegogoHomePageHeaderWebElements megogoHomePageHeaderWebElements = new MegogoHomePageHeaderWebElements(driver);
        Actions action = new Actions(driver);

        goToMegogo();
        fullScreen();
        action.moveToElement(megogoHomePageHeaderWebElements.getOthersBtn());
        action.perform();
        Assert.assertTrue(megogoHomePageHeaderWebElements.getOnlineSchoolBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getEnterPromoCodeBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getGiftsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getAudiobooksAndPodcastsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getLinkTVBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getAllAboutSubscriptionBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getBonusesBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getCashbackBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getBeneficenceBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getSubscriptionForEstablishmentsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getMegogoSetTopBoxBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getMegogoOnDevicesBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getMoviesBySubscriptionBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getTrailersBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getDiscoveryBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getLookHowItsHeardBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getMegogoPokerBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getHBOBtn().isDisplayed());
    }
}
