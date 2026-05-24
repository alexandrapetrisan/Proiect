package tests;


import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

    public class CheckoutTest extends BaseTest {

        @Test
        public void completeCheckoutTest() {

            // Login
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("standard_user", "secret_sauce");

            // Adauga produs
            InventoryPage inventoryPage = new InventoryPage(driver);
            inventoryPage.addProductToCart();
            inventoryPage.getCartBadgeText();

            // Cart
            CartPage cartPage = new CartPage(driver);
            cartPage.clickCheckout();

            // Checkout
            CheckoutPage checkoutPage = new CheckoutPage(driver);
            checkoutPage.completeCheckoutInfo("Alexandra", "Petrisan", "321674");
            checkoutPage.clickFinish();

            // Assertion
            Assert.assertEquals(checkoutPage.getCompleteMessage(), "Thank you for your order!");
        }
    }

