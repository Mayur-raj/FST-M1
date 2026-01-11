import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Activity1 {

    private final int petNumber = 77232;

    @Test(priority = 1)
    public void createPetRecord() {

        Map<String, Object> petPayload = new HashMap<>();
        petPayload.put("id", petNumber);
        petPayload.put("name", "Riley");
        petPayload.put("status", "available");
        petPayload.put("photoUrls", Collections.singletonList("https://sampleurl.com/pet.jpg"));

        Response apiResponse =
                given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .contentType(ContentType.JSON)
                    .body(petPayload)
                .when()
                    .post("/pet");

        apiResponse.then()
                   .statusCode(200)
                   .body("id", equalTo(petNumber))
                   .body("name", equalTo("Riley"))
                   .body("status", equalTo("available"));
    }

    @Test(priority = 2)
    public void fetchPetDetails() {

        Response apiResponse =
                given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .contentType(ContentType.JSON)
                    .pathParam("id", petNumber)
                .when()
                    .get("/pet/{id}");

        apiResponse.then()
                   .statusCode(200)
                   .body("id", equalTo(petNumber))
                   .body("name", equalTo("Riley"))
                   .body("status", equalTo("available"));
    }

    @Test(priority = 3)
    public void removePetEntry() {

        Response apiResponse =
                given()
                    .baseUri("https://petstore.swagger.io/v2")
                    .pathParam("id", petNumber)
                .when()
                    .delete("/pet/{id}");

        apiResponse.then()
                   .statusCode(200)
                   .body("code", equalTo(200))
                   .body("message", equalTo(String.valueOf(petNumber)));
    }
}
