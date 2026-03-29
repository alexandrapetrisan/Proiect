package Tema4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class exe1 {

        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://practicesoftwaretesting.com/");
        }

        @Test
        public void verifyHomePage() {
            String title = driver.getTitle();
            Assert.assertNotNull(title, "Titlul este null!");
            Assert.assertTrue(title.contains("Practice Software Testing"),
                    "Titlul nu conține textul așteptat!");
            WebElement logo = driver.findElement(By.xpath("//img[@alt='Practice Software Testing']"));
            Assert.assertTrue(logo.isDisplayed(), "Logo-ul nu este vizibil!");
        }

        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }
