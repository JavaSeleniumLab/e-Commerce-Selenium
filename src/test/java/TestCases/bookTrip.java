package TestCases;

import POM.Pages.landingPageHotels;
import WebDriverPakg.DriverWrapper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class bookTrip extends landingPageHotels {

    @Test
    public void chooseAutoSuggestion() throws InterruptedException {

        DriverWrapper.initDriver();
        typeDestination("puerto");
        Thread.sleep(10000);

        pickAutoSuggestionB("Puerto Vallarta, Puerto Vallarta, Jalisco, Mexico");

        Thread.sleep(7000);
        clickOnInCalendar();

        Thread.sleep(6000);
        hoverCheckInDay();
        clickOnOutDay();
        hoverCheckOut();

        String nights= numberOfNights();
        Assert.assertEquals(nights, "15", "The number displayed isn't correct");

        clickSearchButton();

    }


}
