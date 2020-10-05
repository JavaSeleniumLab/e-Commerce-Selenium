package Utils;

import WebDriverPakg.DriverWrapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class screenShots extends DriverWrapper {


    public static void takeScreenShot(String filename) throws IOException {

        TakesScreenshot ts = (TakesScreenshot)getDriver();{
            File scr = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("./ScreenShots/"+filename+".png");

            FileUtils.copyFile(scr, dest);
        }



    }








}
