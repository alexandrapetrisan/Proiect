package Tema3;

    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class ex1 {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/automation-practice-form");
            WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
            firstName.sendKeys("Test");
            WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
            lastName.sendKeys("User");
            WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
            email.sendKeys("test@email.com");
            WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
            gender.click();
            WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
            mobile.sendKeys("0712345678");
            WebElement subjects = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
            subjects.sendKeys("Maths");
            subjects.sendKeys("\n"); // confirmă selecția
            WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
            address.sendKeys("Test Address");
            WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
            submit.click();
            Thread.sleep(2000);
            WebElement modal = driver.findElement(By.xpath("//div[@class='modal-content']"));
            if (modal.isDisplayed()) {
                System.out.println("Pop-up afișat!");
                WebElement closeBtn = driver.findElement(By.xpath("//button[text()='Close']"));
                closeBtn.click();
            }
            driver.quit();
        }
    }

