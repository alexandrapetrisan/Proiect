package Tema3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

  public class ex2 {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
    }
    @Test
    public void addNewRecordTest() throws InterruptedException {
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();
        driver.findElement(By.id("firstName")).sendKeys("Test");
        driver.findElement(By.id("lastName")).sendKeys("User");
        driver.findElement(By.id("userEmail")).sendKeys("test@email.com");
        driver.findElement(By.id("age")).sendKeys("38");
        driver.findElement(By.id("salary")).sendKeys("1001");
        driver.findElement(By.id("department")).sendKeys("QA");
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
