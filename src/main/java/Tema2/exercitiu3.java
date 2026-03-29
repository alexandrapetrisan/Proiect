package Tema2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class exercitiu3 {
        @Test
        public void testExampleDotCom() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://example.com/");
            driver.quit();
        }
        @Test
        public void testAppleDotCom() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.apple.com/");
            driver.quit();
        }
    }

