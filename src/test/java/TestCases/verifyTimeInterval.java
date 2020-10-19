package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class verifyTimeInterval {

    @Test
    public void verifyTimeWithCalendar() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://darksky.net/";
        driver.get(url);

        //System.out.println(listTimeInterval());
        Calendar start = Calendar.getInstance();
        start.add(Calendar.HOUR, 2);
        TimeZone tz2 = TimeZone.getTimeZone("GMT");
        Calendar end = Calendar.getInstance(tz2);
        for (Calendar hour = start; hour.before(end); hour.add(Calendar.HOUR, 2)) {
        }
        SimpleDateFormat xs4 = new SimpleDateFormat("ha");
        String date4 = xs4.format(start.getTime());
        System.out.println(date4);


        // Get all interval Values from the WebPage and loop  through:

        By timeRuler = By.xpath("//div[@class='scroll-container']//div[@id='timeline']//child::div[3]//span/span");

        List<WebElement> listTimeInterval = driver.findElements(timeRuler);
        for (WebElement element : listTimeInterval) {
            String time = element.getText();
            System.out.println(time);

            // I need to verify (Loop) with Calendar each WebElement;

        }



        driver.quit();
    }







    }

