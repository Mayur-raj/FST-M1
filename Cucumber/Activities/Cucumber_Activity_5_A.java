import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsActivityFive extends BaseClass {

    @Given("the user is on the login page")
    public void openLoginScreen() {
        driver.navigate().to("https://training-support.net/webelements/login-form");
        Assertions.assertEquals("Selenium: Login Form", driver.getTitle());
    }

    @When("the user enters username and password")
    public void enterDefaultLogin() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
    }

    @When("the user enters {string} and {string}")
    public void enterLoginDetails(String user, String pass) {
        WebElement userInput = driver.findElement(By.id("username"));
        WebElement passInput = driver.findElement(By.id("password"));

        userInput.clear();
        passInput.clear();

        userInput.sendKeys(user);
        passInput.sendKeys(pass);
    }

    @And("clicks the submit button")
    public void submitLoginForm() {
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }

    @Then("get the confirmation message and verify it")
    public void verifyAdminLoginMessage() {
        wait.until(
                ExpectedConditions.textToBePresentInElementLocated(
                        By.cssSelector("h2.mt-5"), "Welcome"
                )
        );
        String result = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        Assertions.assertEquals("Welcome Back, Admin!", result);
    }

    @Then("get the confirmation text and verify message as {string}")
    public void verifyLoginResult(String expectedResult) {
        String actualResult;

        if (expectedResult.contains("Invalid")) {
            actualResult = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("h2#subheading")
                    )
            ).getText();
        } else {
            actualResult = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.cssSelector("h2.mt-5")
                    )
            ).getText();
        }

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
