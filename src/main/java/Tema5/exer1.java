package Tema5;

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

    public class exer1 {

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
        public void filterProductsTest() {
            WebElement category = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(text(),'Hand Tools')]")
            ));
            category.click();
            String selectedCategory = "hand";
            WebElement brandFilter = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//label[contains(text(),'ForgeFlex')]")
            ));
            brandFilter.click();
            List<WebElement> products = wait.until(
                    ExpectedConditions.visibilityOfAllElementsLocatedBy(
                            By.xpath("//div[contains(@class,'card')]")
                    )
            );
            int count = 0;
            for (WebElement product : products) {
                String text = product.getText().toLowerCase();
                if (text.contains(selectedCategory)) {
                    count++;
                }
            }
            Assert.assertTrue(count >= 2,
                    "Mai puțin de 2 produse conțin categoria selectată!");
        }

        @AfterMethod
        public void tearDown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }

