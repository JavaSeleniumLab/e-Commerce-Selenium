package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verifySignIn {


    @Test
    public void TestCase (){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\golde\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://clubs3qa1.scholastic.com/");


        String title= driver.getTitle();
        System.out.println(title);










    }




    }

