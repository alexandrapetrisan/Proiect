package tests;


import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

    public class CheckoutTest extends BaseTest {

        WebDriver driver;

        @Test
        protected void completeCheckoutTest() {

            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/");

            // Login
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("standard_user", "secret_sauce");
            Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

            // Adauga produs
            InventoryPage inventoryPage = new InventoryPage(driver);
            inventoryPage.addProductToCart();
            inventoryPage.getCartBadgeText();
            Assert.assertEquals(inventoryPage.getCartBadgeText(), "1");

            // Deschide cart
            inventoryPage.openCart();

            // Cart
            CartPage cartPage = new CartPage(driver);
            Assert.assertEquals(cartPage.getCartItemName(), "Sauce Labs Backpack");
            cartPage.clickCheckout();

            // Checkout
            CheckoutPage checkoutPage = new CheckoutPage(driver);
            checkoutPage.completeCheckoutInfo("Alexandra", "Petrisan", "321674");
            checkoutPage.clickFinish();

            // Assertion
            Assert.assertEquals(checkoutPage.getCompleteMessage(), "Thank you for your order!");
            driver.quit();
        }
    }

