package Tema2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

     public class exercitiu4 {

        WebDriver driver;
        @Test
        public void testExampleDotCom() {
            driver = new ChromeDriver();
            driver.get("https://example.com/");
        }
        @Test
        public void testAppleDotCom() {
            driver = new ChromeDriver();
            driver.get("https://www.apple.com/");
        }
        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }

}
