package interview.coding;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TakeAScreenShoot {
    private WebDriver driver;

    public void takeScreenshotOnFailure(ITestResult result) throws IOException {
        if(result.getStatus() == ITestResult.FAILURE) {
            // Take a screenshot using TakesScreenShot interface
            TakesScreenshot ts = (TakesScreenshot) driver;
            File screenShotFile = ts.getScreenshotAs(OutputType.FILE);

            //Save the screenshot file
            Files.move(Paths.get(screenShotFile.getAbsolutePath()), Paths.get("screenshots/" + result.getName() + " .png"));
        }
    }
}
