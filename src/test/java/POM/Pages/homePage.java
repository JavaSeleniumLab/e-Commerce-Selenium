package POM.Pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class homePage extends basePage {

    By salutation = By.xpath("//span[@class='teacher-name-with-salutation']");

    @Step("Verifying User see Salutation")
    public String confirmUserName() {
        return getText(salutation);
    }
    @Step("Verify is Salutation displayed")
    public boolean isSalutationD(){
        return isElementDisplayed(salutation);
    }
}
