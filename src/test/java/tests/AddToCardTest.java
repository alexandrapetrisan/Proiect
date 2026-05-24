package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

   public class AddToCardTest {

       @Test
       public void addToCartTest() {

           WebDriver driver;
           LoginPage loginPage = new LoginPage(driver);
           loginPage.login("standard_user", "secret_sauce");

           InventoryPage inventoryPage = new InventoryPage(driver);
           inventoryPage.addProductToCart();

           Assert.assertEquals(inventoryPage.getCartBadgeText(), "1");
       }

   }