package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

import java.time.Duration;

  public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod

    public void setUp(){

        Object WebDriverManager;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigReader.getProperty("ui.url"));

    }

    @AfterMethod
    public void tearDown(){
            driver.quit();



    }
  }
