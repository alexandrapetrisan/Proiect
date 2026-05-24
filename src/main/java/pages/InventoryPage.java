package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

   public class InventoryPage {

        WebDriver driver;

        By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
        By cartBadge = By.className("shopping_cart_badge");

        public InventoryPage(WebDriver driver) {
            this.driver = driver;
        }

        public void addProductToCart() {
            driver.findElement(addToCartButton).click();
        }

        public String getCartBadgeText() {
            return driver.findElement(cartBadge).getText();
        }
   }
