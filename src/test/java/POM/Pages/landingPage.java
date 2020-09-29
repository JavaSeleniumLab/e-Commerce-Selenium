package POM.Pages;
import org.openqa.selenium.By;

public class landingPage extends basePage {
    By headerSignIn = By.xpath("//div[@class='menu-nav']//a[@class='signin']");
    By enterEmail = By.xpath("//div[@role='dialog']//child::div//div//div//div//input[@placeholder='Scholastic Account Email']");
    By enterPassword = By.xpath("//div[@class='form-row row-password-input required']//input[@type='password']");
    By signInbutton = By.xpath("//div[@class='align-center']//button[@type='submit' and @value='Login']");



    public void findHeaderSignIn (){findWebElement(headerSignIn);}
    public void clickHeaderSignIn() {clickThis(headerSignIn);}
    public void enterEmail(String userEmail){
        type(enterEmail, userEmail);
    }
    public void enterPassword (String password){
        type(enterPassword, password);

    }
    public void clickButton (){
        clickThis(signInbutton);
    }










}

