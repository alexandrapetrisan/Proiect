package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class CartPage {

        WebDriver driver;

        // Locator
        By checkoutButton = By.id("checkout");
        By removeButton = By.id("remove-sauce-labs-backpack");
        By cartItem = By.className("inventory_item_name");

        // Constructor
        public CartPage(WebDriver driver) {
            this.driver = driver;
        }

        // Actiunea
        public String getCartItemName() {
            return driver.findElement(cartItem).getText();
        }

        public void removeProduct() {
            driver.findElement(removeButton).click();
        }

        public void clickCheckout() {
            driver.findElement(checkoutButton).click();
        }
    }
