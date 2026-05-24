package utils;


import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

    public class ScreenshotUtils {

        public static void takeScreenshot(WebDriver driver, String screenshotName, DocFile FileUtils) {

            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File destinationFile = new File("screenshots/" + screenshotName + ".png");

            try {
                FileUtils.copyFile(srcFile, destinationFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

