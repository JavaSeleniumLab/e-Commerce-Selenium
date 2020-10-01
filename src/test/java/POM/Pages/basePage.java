package POM.Pages;

import WebDriverPakg.DriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class basePage extends DriverWrapper {

    public List<WebElement> findWebElements (By locator) {
        return getDriver().findElements(locator);
    }

    public WebElement findWebElement (By locator){
        return DriverWrapper.getDriver().findElement(locator);
    }

    public void type(By locator, String data) {
        findWebElement(locator).sendKeys(data);
    }

    public void clickThis(By locator) {
        findWebElement(locator).click();
    }

    public boolean isElementDisplayed(By locator) {
        return findWebElement(locator).isDisplayed();
    }

    // isSelected
    public boolean isSelected (By locator){
        return findWebElement(locator).isSelected();
    }

    // isEnabled
    public boolean isEnabled (By locator){
        return findWebElement(locator).isEnabled();
    }

    // getText
    public String getText(By locator){
       String text= findWebElement(locator).getText();
       return text;
    }

    // getAttribute
    public String getAttribute(By locator, String attName){
        return findWebElement(locator).getAttribute(attName);
    }

    // getTitle
    public String getTitle(){
        return getDriver().getTitle();
    }

    // getCurrentUrl
    public String getCurrentUrl(){
        return getDriver().getCurrentUrl();
    }

    //
    public String getValue(){
        return getDriver().getTitle();
    }

    public void selectText (By locator, String text){
       WebElement textLocator= findWebElement(locator);
        Select s1 = new Select(textLocator);
        s1.selectByVisibleText(text);
    }

    public void selectValueAttr (By locator, String value){
        WebElement valueLocator=findWebElement(locator);
        Select s2= new Select(valueLocator);
        s2.selectByValue(value);
    }

    public void selectIndex (By locator, int index){
        WebElement indexLocator = findWebElement(locator);
        Select s3 = new Select(indexLocator);
        s3.deselectByIndex(index);
    }

    public String getWindowHandle(){
       return getDriver().getWindowHandle();
    }

    public Set<String> getWindowHandles(){
        return getDriver().getWindowHandles();
    }

    public void switchToNewWindow(String handle){
        getDriver().switchTo().window(handle);
    }

    public void switchToFrame (String id){
        getDriver().switchTo().frame(id);
    }

    public void switchToWebFrame (By locator){
        WebElement webFrameLocator=findWebElement(locator);
        getDriver().switchTo().frame(webFrameLocator);
    }

    public void pickAutoSuggest (By locator, String input){
        List<WebElement> allList= findWebElements(locator);
        for (WebElement suggestion: allList){
            if (suggestion.getText().equalsIgnoreCase(input))
                suggestion.click();
                break;
        }




    }
}
