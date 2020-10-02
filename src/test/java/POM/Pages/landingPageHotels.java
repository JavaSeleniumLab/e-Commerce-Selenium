package POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class landingPageHotels extends basePage {

    By searchButtonLocator = (By.id("qf-0q-destination"));
    By autoLocator = By.xpath("//div[@class='autosuggest-category-result']");

    By checkInCalendar = By.xpath("//label[@data-input='qf-0q-localised-check-in']");

    By locatorDate = By.xpath("(//div[@class='widget-datepicker-bd'])[1]//td[not(contains(@class,'datepicker-empty'))]//a");
    By oct10 = By.xpath("//td[@data-date='2020-9-10']");

    By idCheckOut = By.xpath("//label[@data-input='qf-0q-localised-check-out']");
    By oct25 = By.xpath("//td[@data-date='2020-9-25']");

    By briefCase= By.xpath("//span[@class='widget-query-num-nights']");

    By searchButton = By.xpath("//button[@type='submit']");






    public void typeDestination(String input){
        type(searchButtonLocator, input);

    }

    public void pickAutoSuggestion (String input){
        List<WebElement> listOfSuggest = getDriver().findElements((locatorDate));
        for (WebElement options: listOfSuggest){
            if(options.getText().equalsIgnoreCase(input))
                options.click();
            break;
        }
    }

    public void pickAutoSuggestionB (String userInput){
        pickAutoSuggest(autoLocator, userInput);
    }

    public void clickOnInCalendar(){
        clickThis(checkInCalendar);
    }

    public void chooseInDate (String userDate){
        pickUpDate(locatorDate, userDate);
    }

    public void hoverCheckInDay(){
        mouseHoverOnElement(oct10);
    }
    public void clickOnOutDay(){
        clickThis(idCheckOut);
    }

    public void hoverCheckOut(){
        mouseHoverOnElement(oct25);
    }

    public String numberOfNights(){
        return getText(briefCase);
    }

    public void clickSearchButton(){
        clickThis(searchButton);
    }
}
