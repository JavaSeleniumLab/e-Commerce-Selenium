package TestCases;

import POM.Pages.landingPage;
import WebDriverPakg.DriverWrapper;
import org.testng.annotations.Test;

public class verifySignInInvalid extends landingPage {

    @Test
    public void signInWithInvalid() throws InterruptedException {

        DriverWrapper.initDriver();
        Thread.sleep(60000);
        findHeaderSignIn();
        clickHeaderSignIn();
        enterEmail("mytestingworld@gmail.com");
        enterPassword("Alina2020");
        clickButton();

        DriverWrapper.quitDriver();










    }













}
