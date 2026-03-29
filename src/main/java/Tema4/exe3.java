package Tema4;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

     public class exe3 {

        WebDriver driver;
        WebDriverWait wait;
        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://practicesoftwaretesting.com/");
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
        @Test
        public void openProductTest() {
            List<WebElement> products = wait.until(
                    ExpectedConditions.visibilityOfAllElementsLocatedBy(
                            By.xpath("//div[contains(@class,'card')]")
                    )
            );
            products.get(0).click();
            WebElement productImage = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//img[contains(@class,'img-fluid')]")
                    )
            );
            Assert.assertTrue(productImage.isDisplayed(), "Imaginea produsului nu este vizibilă!");
            WebElement addToCartButton = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//button[contains(text(),'Add to cart')]")
                    )
            );
            Assert.assertTrue(addToCartButton.isDisplayed(), "Butonul 'Add to cart' nu este vizibil!");
        }

        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

