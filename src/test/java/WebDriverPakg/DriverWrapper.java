package WebDriverPakg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverWrapper {

    private static WebDriver driver;

    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://clubs3qa1.scholastic.com/");
    }


    public void quitDriver() {

        driver.quit();
    }


    public static WebDriver getDriver() {
        return driver;
    }




}







