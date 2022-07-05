package Tests;

import PageObjects.MegogoHomePageWebElements.MegogoHomePageBodyWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageBody extends TestInit {

    @Test public void testHomePageBody() {

        MegogoHomePageBodyWebElements megogoHomePageBodyWebElements = new MegogoHomePageBodyWebElements(driver);

        fullScreen();
        goToMegogo();
        Assert.assertTrue(megogoHomePageBodyWebElements.getNewsWindowBtnLeft().get(0).isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getNewsWindowBtnLeft().get(1).isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getTariffBtn().get(0).isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getFilmsBtn().get(0).isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getMultFilmsBtn().get(0).isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getPremiersBtn().get(0).isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getNowTVBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getPremiersCategoriesBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getPopularBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getNewInSubscriptionBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getGrabForWeekendBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getWhatLookNowBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getChooseCategoriesBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getSubscriptionTryBy1UahBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getTop5FilmsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getSerialAndShowBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageBodyWebElements.getCartoonBtn().isDisplayed());
    }
}
