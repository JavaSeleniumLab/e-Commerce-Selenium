package POM.Pages;

import WebDriverPakg.DriverWrapper;
import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class basePage extends DriverWrapper {

    public List<WebElement> findFluentWebElements (By locator) {
        Wait fWait = new FluentWait(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found after 30seconds of wait");

        List<WebElement> elements = (List<WebElement>) fWait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                return driver.findElements(locator);
            }
        });
        return elements;
        //return getDriver().findElements(locator);
    }

    public List<WebElement> findWebElements (By locator){
        return getDriver().findElements(locator);
    }

    public WebElement findFluentWebElement (final By locator){
        Wait fWait = new FluentWait(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found after 30seconds of wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
        //return DriverWrapper.getDriver().findElement(locator);
    }

    public WebElement findWebElement(By locator){
        return getDriver().findElement(locator);
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

    public Alert switchToAlert() {
        return getDriver().switchTo().alert();
    }

    public String getAlertText(Alert alert) {
        return alert.getText();
    }

    public void dismissAlert(Alert alert) {
        alert.dismiss();
    }

    public void acceptAlert(Alert alert) {
        alert.accept();
    }

    public void writeOnAlert(Alert alert, String data) {
        alert.sendKeys(data);
    }

    public void mouseHoverOnElement(By locator) {
        WebElement element = findWebElement(locator);
        Actions act = new Actions(getDriver());
        act.moveToElement(element);
        act.click().build().perform();
    }

    public void mouseHoverOnElement(WebElement element) {
        Actions act = new Actions(getDriver());
        act.moveToElement(element);
    }

    public void pickAutoSuggest (By locator, String input){
        List<WebElement> allList= findWebElements(locator);
        for (WebElement suggestion: allList){
            if (suggestion.getText().equalsIgnoreCase(input))
                suggestion.click();
                break;
        }
    }

    public void pickUpDate (By locatorB, String checkIn) {
        List<WebElement> dateElement = findWebElements(locatorB);
        for (WebElement date : dateElement) {
            if (date.getText().equalsIgnoreCase(checkIn))
                date.click();
                break;
        }
    }


    public void scrollDownByPixel(int y) {
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("scrollBy(0,"+y+");");
    }

    public void scrollUpByPixel(int y) {
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("scrollBy(0,-"+y+");");
    }

    public void MoveAroundByPixel(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("scrollBy("+x+","+y+");");
    }

    public void scrollUptoElement(By locator) {
        WebElement element = findWebElement(locator);
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor)getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
    }
}
