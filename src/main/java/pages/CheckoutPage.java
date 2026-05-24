package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class CheckoutPage {

        WebDriver driver;

        // Locator
        By firstNameField = By.id("first-name");
        By lastNameField = By.id("last-name");
        By postalCodeField = By.id("postal-code");
        By continueButton = By.id("continue");
        By finishButton = By.id("finish");
        By completeMessage = By.className("complete-header");

        // Constructor
        public CheckoutPage(WebDriver driver) {
            this.driver = driver;
        }

        // Actiunea
        public void enterFirstName(String firstName) {
            driver.findElement(firstNameField).sendKeys(firstName);
        }

        public void enterLastName(String lastName) {
            driver.findElement(lastNameField).sendKeys(lastName);
        }

        public void enterPostalCode(String postalCode) {
            driver.findElement(postalCodeField).sendKeys(postalCode);
        }

        public void clickContinue() {
            driver.findElement(continueButton).click();
        }

        public void clickFinish() {
            driver.findElement(finishButton).click();
        }

        public String getCompleteMessage() {
            return driver.findElement(completeMessage).getText();
        }

        // Metoda reutilizabila
        public void completeCheckoutInfo(String firstName, String lastName, String postalCode) {

            enterFirstName(firstName);
            enterLastName(lastName);
            enterPostalCode(postalCode);
            clickContinue();
        }
    }

