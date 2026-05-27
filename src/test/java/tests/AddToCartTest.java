package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InventoryPage;
import pages.LoginPage;

   public class AddToCartTest {

       @Test
       public void addToCartTest() {

           WebDriver driver = new ChromeDriver();
           driver.get("https://www.saucedemo.com");
           LoginPage loginPage = new LoginPage(driver);
           loginPage.login("standard_user", "secret_sauce");

           InventoryPage inventoryPage = new InventoryPage(driver);
           inventoryPage.addProductToCart();

           Assert.assertEquals(inventoryPage.getCartBadgeText(), "1");

           driver.quit();
       }


   }