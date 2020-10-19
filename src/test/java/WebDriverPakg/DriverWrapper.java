package WebDriverPakg;

import Utils.screenShots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverWrapper {

    private static WebDriver driver;
    private static String userName = "Alina777";
    private static String access_KEY="5c00cc75-8af9-4d8b-a2d3-16cc880b509d";
    private static String sauce_URl = "https://" + userName +":"+ access_KEY +"@ondemand.us-west-1.saucelabs.com:443/wd/hub";



    @Parameters({"url", "browserName"})
    @BeforeMethod

    public static void initDriver(@Optional("https://clubs3qa1.scholastic.com") String url, @Optional("chrome") String browserName) {

        switch (browserName.toLowerCase()) {
            case "chrome":
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            //driver.get("https://hotels.com/");
            //driver.get("https://darksky.net/");
                break;
            case"sauce":
                DesiredCapabilities ds = DesiredCapabilities.chrome();
                ds.setCapability("platform", "Windows 10");
                ds.setCapability("version", "latest");
                try {
                    driver=new RemoteWebDriver(new URL(sauce_URl), ds);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                break;

        }
        driver.get(url);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    public static WebDriver getDriver() {
        return driver;
    }


    @AfterMethod
    public static void quitDriver(ITestResult iTestResult) {
        if (iTestResult.getStatus()!=iTestResult.SUCCESS){
            screenShots.takeFailedScreenshot();
        }
        driver.quit();
    }


}







