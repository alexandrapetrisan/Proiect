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

   public class exe4 {

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
        public void filterByCategoryTest() {
            WebElement categoryFilter = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//label[contains(text(),'Hand Tools')]")
            ));
            categoryFilter.click();
            List<WebElement> products = wait.until(
                    ExpectedConditions.visibilityOfAllElementsLocatedBy(
                            By.xpath("//div[contains(@class,'card')]")
                    )
            );
            for (WebElement product : products) {
                String productText = product.getText().toLowerCase();
                Assert.assertTrue(
                        productText.contains("tool") || productText.contains("hand"),
                        "Produsul nu respectă filtrul: " + productText
                );
            }
        }

        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

