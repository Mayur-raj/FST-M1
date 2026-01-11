import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Activity2 {

    private static final String BASE_URL = "https://petstore.swagger.io/v2/user";
    private static final String USER_NAME = "justinc";

    @Test(priority = 1)
    public void createUserUsingJsonFile() throws IOException {

        FileInputStream jsonStream = new FileInputStream("path/to/userInfo.json");

        Response apiResponse =
                given()
                    .baseUri(BASE_URL)
                    .contentType("application/json")
                    .body(jsonStream)
                .when()
                    .post();

        jsonStream.close();

        apiResponse.then()
                   .body("code", equalTo(200))
                   .body("message", equalTo("9901"));
    }

    @Test(priority = 2)
    public void retrieveUserAndSaveResponse() {

        File responseFile = new File("src/test/java/activities/userGETResponse.json");

        Response apiResponse =
                given()
                    .baseUri(BASE_URL)
                    .contentType("application/json")
                    .pathParam("user", USER_NAME)
                .when()
                    .get("/{user}");

        String formattedResponse = apiResponse.getBody().asPrettyString();

        try (FileWriter fileWriter = new FileWriter(responseFile)) {
            responseFile.createNewFile();
            fileWriter.write(formattedResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }

        apiResponse.then()
                   .body("id", equalTo(9901))
                   .body("username", equalTo("justinc"))
                   .body("firstName", equalTo("Justin"))
                   .body("lastName", equalTo("Case"))
                   .body("email", equalTo("justincase@mail.com"))
                   .body("password", equalTo("password123"))
                   .body("phone", equalTo("9812763450"));
    }

    @Test(priority = 3)
    public void removeUserAccount() {

        Response apiResponse =
                given()
                    .baseUri(BASE_URL)
                    .contentType("application/json")
                    .pathParam("user", USER_NAME)
                .when()
                    .delete("/{user}");

        apiResponse.then()
                   .body("code", equalTo(200))
                   .body("message", equalTo(USER_NAME));
    }
}
