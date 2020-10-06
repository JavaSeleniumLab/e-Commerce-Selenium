package TestCases;

import POM.Pages.landingPage;
import WebDriverPakg.DriverWrapper;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class verifySignInInvalid extends landingPage {

    @Test(description = "Signing In with Invalid Credentials")
    @Description("Allure - Verify Sign in with Invalid credentials")
    @Epic("002")
    @Feature("Feature- Invalid Sign in In Head")
    @Story("Can Log in from Head")
    @Severity(SeverityLevel.BLOCKER)

    public void signInWithInvalid() throws InterruptedException {

        Thread.sleep(60000);
        findHeaderSignIn();
        clickHeaderSignIn();
        enterEmail("mytestingworld@gmail.com");
        enterPassword("Alina2020");
        clickButton();

        DriverWrapper.quitDriver();










    }













}
