package Tema2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

     public class exercitiu5 {

        @Test
        public void verifyExampleTitle() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://example.com");
            String title = driver.getTitle();
            Assert.assertNotNull(title, "Titlul este null!");
            Assert.assertTrue(title.contains("Example"), "Titlul nu conține 'Example'!");
            driver.quit();
        }
}
