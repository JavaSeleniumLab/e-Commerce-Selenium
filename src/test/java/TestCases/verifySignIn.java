package TestCases;

import POM.Pages.homePage;
import POM.Pages.landingPage;
import WebDriverPakg.DriverWrapper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifySignIn extends landingPage{


    @Test
    public void TestCase () throws InterruptedException {

        DriverWrapper.initDriver();
        Thread.sleep(60000);
        findHeaderSignIn();
        clickHeaderSignIn();
        enterEmail("mytestingworldlife@gmail.com");
        enterPassword("Alina2020");
        clickButton();

        homePage h1= new homePage();
        h1.confirmUserName();

        Assert.assertTrue(h1.isSalutationD(), "Salutation isn't displayed");

        getDriver().quit();

    }




    }

