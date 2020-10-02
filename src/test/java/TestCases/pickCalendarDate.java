package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class pickCalendarDate  {

    @Test (priority = 1)

    public void chooseAutoSuggest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotels.com/");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        By idLocator = (By.id("qf-0q-destination"));
        WebElement element = driver.findElement(idLocator);
        element.sendKeys("puerto");

        Thread.sleep(5000);

        String userInput = "Puerto Rico";

        By autoLocator = By.xpath("//div[@class='autosuggest-category-result']");

        List<WebElement> listOfSuggest = driver.findElements(autoLocator);
        for (WebElement options: listOfSuggest){
            if(options.getText().equalsIgnoreCase(userInput))
                options.click();
            break;
        }
    }

    @Test(priority = 2)
    public void selectDate() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotels.com/");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        String checkIn = "10";

        driver.findElement(By.id("qf-0q-localised-check-in")).click();

        By locatorDate = By.xpath("(//div[@class='widget-datepicker-bd'])[1]//td[not(contains(@class,'datepicker-empty'))]//a");

        List<WebElement> dateElement = driver.findElements(locatorDate);
        for (WebElement date: dateElement) {
            if (date.getText().equals(checkIn)){
                date.click();
                break;
            }
        }
            Thread.sleep(3000);


        driver.findElement(By.xpath("//label[@data-input='qf-0q-localised-check-out']")).click();

        String checkOut ="25";
        By locatorDate2 = By.xpath("(//div[@class='widget-datepicker-bd'])[1]//td[not(contains(@class,'datepicker-empty'))]//a");

        List<WebElement> dateElement2 = driver.findElements(locatorDate2);
        for (WebElement date2 : dateElement2){
            if(date2.getText().equals(checkOut)){
                date2.click();
                break;
            }
        }

    }




    @Test (priority = 3)
    public void checkInDate() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hotels.com/");
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        By idCheckIn = By.id("qf-0q-localised-check-in");
        WebElement checkInId = driver.findElement(idCheckIn);

        Actions a1 =new Actions(driver);

        a1.click(checkInId).build().perform();

        By oct10 = By.xpath("//td[@data-date='2020-9-10']");
        WebElement dateElem = driver.findElement(oct10);

        Actions a2 =new Actions(driver);
        a2.click(dateElem).build().perform();

        Thread.sleep(5000);

        // CHECK OUT HERE:

        By idCheckOut = By.xpath("//label[@data-input='qf-0q-localised-check-out']");
        WebElement checkOut = driver.findElement(idCheckOut);

        Actions a3 = new Actions(driver);
        a3.click(checkOut).build().perform();

        By oct25 = By.xpath("//td[@data-date='2020-9-25']");
        WebElement dateElem2 = driver.findElement(oct25);

        Actions a4 = new Actions(driver);
        a4.click(dateElem2).build().perform();


    }

    @Test(priority = 4)
    public void selectAnyDate(){










    }

}
