package POM.Pages;
import org.openqa.selenium.By;

public class landingPage extends basePage {
    By headerSignIn = By.xpath("//div[@class='menu-nav']//a[@class='signin']");

    public void clickHeaderSignIn() {
        clickThis(headerSignIn);
    }


}

