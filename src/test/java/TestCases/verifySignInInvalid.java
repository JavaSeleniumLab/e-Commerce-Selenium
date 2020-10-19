package TestCases;

import POM.Pages.landingPage;
import WebDriverPakg.DriverWrapper;
import io.qameta.allure.*;
import org.testng.annotations.Test;

public class verifySignInInvalid extends DriverWrapper {

    @Test(description = "Signing In with Invalid Credentials")
    @Description("Allure - Verify Sign in with Invalid credentials")
    @Epic("002")
    @Feature("Feature- Invalid Sign in In Head")
    @Story("Can Log in from Head")
    @Severity(SeverityLevel.BLOCKER)

    public void signInWithInvalid() throws InterruptedException {

        landingPage l1= new landingPage();
        //Thread.sleep(60000);
        l1.findHeaderSignIn();
        l1.clickHeaderSignIn();
        l1.enterEmail("mytestingworld@gmail.com");
        l1.enterPassword("Alina2020");
        l1.clickButton();




    }













}
