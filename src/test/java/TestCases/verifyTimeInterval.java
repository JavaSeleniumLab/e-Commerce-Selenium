package TestCases;

import POM.Pages.homePageDarkSky;
import WebDriverPakg.DriverWrapper;
import org.testng.annotations.Test;

public class verifyTimeInterval extends homePageDarkSky {

    @Test
    public void verifyTimeWithCalendar() throws InterruptedException {

        DriverWrapper.initDriver();
        Thread.sleep(5000);
        String time= getTimeInterval();
        System.out.println(time);

        //System.out.println(listTimeInterval());


    }
}
