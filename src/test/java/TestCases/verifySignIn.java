package TestCases;

import POM.Pages.landingPage;
import WebDriverPakg.DriverWrapper;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifySignIn extends DriverWrapper {


    @Test (description = "Verify Sign in with valid credentials")
    @Description ("Allure - Verify Sign in with valid credentials")
    @Epic("001")
    @Feature("Feature- Sign in In Head")
    @Story("Can Log in from Head")
    @Severity(SeverityLevel.BLOCKER)

    public void TestCase () throws InterruptedException {

        landingPage l2=new landingPage();
        Thread.sleep(5);
        l2.findHeaderSignIn();
        l2.clickHeaderSignIn();
        l2.enterEmail("mytestingworldlife@gmail.com");
        Thread.sleep(3000);
        l2.enterPassword("Alina2020");
        Thread.sleep(3000);
        l2.clickButton();


        Assert.assertTrue(false, "Salutation isn't displayed");


    }




    }

