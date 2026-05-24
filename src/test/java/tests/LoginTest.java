package tests;


import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

   public class LoginTest extends BaseTest {

        @Test
        public void successfulLoginTest() {

            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("standard_user", "secret_sauce");

            Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));

        }
   }
