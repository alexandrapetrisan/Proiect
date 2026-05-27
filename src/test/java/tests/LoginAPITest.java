package tests;

import base.BaseAPI;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoginAPITest extends BaseAPI {

        @Test
        public void loginTest() {

            String requestBody = """
                {
                    "username": "standard_user",
                    "password": "secret_sauce"
                }
                """;

            int statusCode = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)

                    .when()
                    .post("/api/login")

                    .then()
                    .extract()
                    .statusCode();

            Assert.assertEquals(statusCode, 200);

            System.out.println("Login API test passed!");
        }
    }

