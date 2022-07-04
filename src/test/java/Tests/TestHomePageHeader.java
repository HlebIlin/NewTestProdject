package Tests;

import PageObjects.MegogoHomePageWebElements.MegogoHomePageHeaderWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomePageHeader extends TestInit{

    @Test
    public void testHomePageHeader(){
        MegogoHomePageHeaderWebElements megogoHomePageHeaderWebElements=new MegogoHomePageHeaderWebElements(driver);

        goToMegogo();
        fullScreen();
        Assert.assertTrue(megogoHomePageHeaderWebElements.getMegogoIconBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getTVChannelsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getFilmsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getCartoonsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getSerialsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getShowsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getSportBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getBloggersBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getOthersBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getTariffsBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getSearchBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getLanguageBtn().isDisplayed());
        Assert.assertTrue(megogoHomePageHeaderWebElements.getLogInBtn().isDisplayed());

    }
}
