package TestCases;

import POM.Pages.homePageHotels;
import POM.Pages.landingPageHotels;
import org.testng.Assert;
import org.testng.annotations.Test;

public class bookTrip extends landingPageHotels {

    @Test
    public void chooseAutoSuggestion() throws InterruptedException {

        typeDestination("puerto");
        Thread.sleep(10000);

        pickAutoSuggestionB("Puerto Vallarta, Puerto Vallarta, Jalisco, Mexico");

        Thread.sleep(7000);
        clickOnInCalendar();

        Thread.sleep(6000);
        hoverCheckInDay();
        clickOnOutDay();
        hoverCheckOut();

        String nights = numberOfNights();
        Assert.assertEquals(nights, "15", "The number displayed isn't correct");

        clickSearchButton();



        homePageHotels h1 = new homePageHotels();
        h1.showFifthOption();

        String price = h1.getPriceOfFifthLocation();
        System.out.println(price);

        Thread.sleep(5000);
       // WebDriverWait eWait = new WebDriverWait(getDriver(), 10);
        h1.clickOnChooseRoom();
        String price2 = h1.getRoomPrice();

        Assert.assertEquals(price, price2, "Prices don't match");

        Assert.assertTrue(h1.isReserveDisplayed());

    }


}
