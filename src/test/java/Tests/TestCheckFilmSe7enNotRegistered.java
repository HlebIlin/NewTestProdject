package Tests;

import PageObjects.MegogoHomePageWebElements.HomePageFilmsWithTitleSe7en;
import PageObjects.MegogoHomePageWebElements.HomepageFilmSe7en;
import PageObjects.MegogoHomePageWebElements.MegogoHomePageHeaderWebElements;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCheckFilmSe7enNotRegistered extends TestInit {

    @Test
    public void CheckFilmSe7enNotRegistered() {
        MegogoHomePageHeaderWebElements megogoHomePageHeaderWebElements = new MegogoHomePageHeaderWebElements(driver);
        HomePageFilmsWithTitleSe7en homePageFimsWithTitleSe7en = new HomePageFilmsWithTitleSe7en(driver);
        HomepageFilmSe7en homepageFilmSe7en = new HomepageFilmSe7en(driver);

        fullScreen();
        goToMegogo();
        megogoHomePageHeaderWebElements.getSearchBtn().click();
        megogoHomePageHeaderWebElements.getSearchBtn().sendKeys(" Сім \n");
        homePageFimsWithTitleSe7en.getFilmSimBtn().click();
        homepageFilmSe7en.yesToMe18().get(0).click();
        homepageFilmSe7en.getWatchBtn().get(0).click();
        Assert.assertTrue(getURL().contains("2454381-sim"));
    }
}
