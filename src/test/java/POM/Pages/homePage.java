package POM.Pages;

import org.openqa.selenium.By;

public class homePage extends basePage {

    By salutation = By.xpath("//span[@class='teacher-name-with-salutation']");


    public String confirmUserName() {
        return getText(salutation);
    }
    public boolean isSalutationD(){
        return isElementDisplayed(salutation);
    }
}
