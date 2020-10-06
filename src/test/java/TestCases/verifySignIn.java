package TestCases;

import POM.Pages.homePage;
import POM.Pages.landingPage;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifySignIn extends landingPage{


    @Test (description = "Verify Sign in with valid credentials")
    @Description ("Allure - Verify Sign in with valid credentials")
    @Epic("001")
    @Feature("Feature- Sign in In Head")
    @Story("Can Log in from Head")
    @Severity(SeverityLevel.BLOCKER)

    public void TestCase () throws InterruptedException {

        Thread.sleep(60000);
        findHeaderSignIn();
        clickHeaderSignIn();
        enterEmail("mytestingworldlife@gmail.com");
        Thread.sleep(3000);
        enterPassword("Alina2020");
        Thread.sleep(3000);
        clickButton();

        homePage h1= new homePage();
        h1.confirmUserName();

        Assert.assertTrue(h1.isSalutationD(), "Salutation isn't displayed");

        getDriver().quit();

    }




    }

