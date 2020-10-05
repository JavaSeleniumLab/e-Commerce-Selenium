package POM.Pages;

import org.openqa.selenium.By;

public class homePageHotels extends basePage{

    By fifthLocation = By.xpath("//li[5]//article[1]//section[1]//aside[1]//ins");
    By chooseRoomButton = By.xpath("//li[5]//article[1]//section[1]//aside[1]//a[@class='cta']");
    By priceLocator = By.xpath("//div[@id='hotel-description']//div[2]//div[2]//div[@class='price']//span");
    By reserveButton = By.xpath("//a[@id='book-now-button']");




    public void showFifthOption(){
        scrollUptoElement(fifthLocation);

    }
    public String getPriceOfFifthLocation(){
       return getText(fifthLocation);
    }


    public void clickOnChooseRoom(){
        clickThis(chooseRoomButton);
    }

    public String getRoomPrice(){
        return getText(priceLocator);
    }

    public boolean isReserveDisplayed(){
        return isElementDisplayed(reserveButton);

    }

}
