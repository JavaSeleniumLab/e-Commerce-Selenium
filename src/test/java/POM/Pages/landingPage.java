package POM.Pages;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class landingPage extends basePage {
    By headerSignIn = By.xpath("//div[@class='menu-nav']//a[@class='signin']");
    By enterEmail = By.xpath("//div[@role='dialog']//child::div//div//div//div//input[@placeholder='Scholastic Account Email']");
    By enterPassword = By.xpath("//div[@class='form-row row-password-input required']//input[@type='password']");
    By signInbutton = By.xpath("//div[@class='align-center']//button[@type='submit' and @value='Login']");


    @Step("Searching for Upper Sign In locator")
    public void findHeaderSignIn (){findWebElement(headerSignIn);}

    @Step("Clicking on Upper Sign In tab")
    public void clickHeaderSignIn() {clickThis(headerSignIn);}

    @Step("Entering user Email address {0}")
    public void enterEmail(String userEmail){
        type(enterEmail, userEmail);
    }

    @Step("Entering the password {0}")
    public void enterPassword (String password){
        type(enterPassword, password);

    }
    @Step("Clicking on sign In button")
    public void clickButton (){
        clickThis(signInbutton);
    }










}

