package API;

import base.BaseAPI;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

   public class AddToCartAPITest extends BaseAPI {

        @Test
        public void addProductToCartTest() {

            String requestBody = """
                {
                    "productId": 1,
                    "quantity": 1
                }
                """;

            int statusCode = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)

                    .when()
                    .post("/api/cart")

                    .then()
                    .extract()
                    .statusCode();

            Assert.assertEquals(statusCode, 200);

            System.out.println("Product added to cart successfully!");
        }
   }

