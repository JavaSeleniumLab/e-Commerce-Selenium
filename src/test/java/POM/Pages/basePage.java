package POM.Pages;

import WebDriverPakg.DriverWrapper;
import org.openqa.selenium.By;

public class basePage {

    public void type(By locator, String data) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(data);
    }

    public void clickThis(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }

    public boolean isElementDisplayed(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isDisplayed();
    }

    // isSelected
    public boolean isSelected (By locator){
        return DriverWrapper.getDriver().findElement(locator).isSelected();

    }

    // isEnabled
    public boolean isEnabled (By locator){
        return DriverWrapper.getDriver().findElement(locator).isEnabled();
    }

    // getText
    public String getText(By locator){
       String text= DriverWrapper.getDriver().findElement(locator).getText();
       return text;
    }

    // getAttribute
    public String getAttribute(By locator, String attName){
        return DriverWrapper.getDriver().findElement(locator).getAttribute(attName);
    }
    // getTitle
    public String getTitle(){
        return DriverWrapper.getDriver().getTitle();
    }

    // getCurrentUrl
    public String getCurrentUrl(){
        return DriverWrapper.getDriver().getCurrentUrl();
    }

    //


}
