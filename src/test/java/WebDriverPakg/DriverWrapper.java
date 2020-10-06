package WebDriverPakg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class DriverWrapper {

    private static WebDriver driver;
    @Parameters({"url", "browserName"})
    @BeforeMethod

    public static void initDriver(String url, @Optional("chrome") String browserName) {

        switch (browserName.toLowerCase()) {
            case "chrome":
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(url);
            //driver.get("https://hotels.com/");
            //driver.get("https://darksky.net/");
        }
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    public static WebDriver getDriver() {
        return driver;
    }

    @AfterMethod
    public static void quitDriver() {
        driver.quit();
    }


}







