package POM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class homePageDarkSky extends basePage {

    //By timeRuler= By.xpath("//div[@id='timeline']//div[@class='hours']//span[@class='hour']/span");//output 11am
    //By timeRuler = By.xpath("//div[@class='timeline']//span[@class='hour']/span");//12pm
    //By timeRuler= By.xpath("//div[@class='timeline']//span[@class='hour']//span[contains(text(),'pm')]");
    //By timeRuler= By.xpath("//div[@class='hours']//child::span");
    //By timeRuler  = By.xpath("//div[@class='hours']//child::span[@class='hour']/span");
    By timeRuler = By.xpath("//div[@class='scroll-container']//div[@id='timeline']//child::div[3]//span/span");



    public String getTimeInterval(){
        return getText(timeRuler);
    }


    public List<WebElement> listTimeInterval(){
        List<WebElement> myList=findWebElements(timeRuler);
        for (WebElement element: myList){
            String time = element.getText();
        }
        return myList;
    }
}
