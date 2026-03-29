package Tema2;

import com.google.common.annotations.VisibleForTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class exercitiul2 {

    @Test
    public void verificaTitlulPagina(){
        WebDriver driver =  new ChromeDriver();
        driver.get("https://example.com");
        String titlu = driver.getTitle();
        Assert.assertTrue(titlu.contains("Example Domain"));
        driver.quit();
    }
}
