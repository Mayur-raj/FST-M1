import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs extends BaseClass {

    @Given("the user is on the login page")
    public void navigateToLoginPage() {
        driver.navigate().to("https://training-support.net/webelements/login-form");
        Assertions.assertEquals("Selenium: Login Form", driver.getTitle());
    }

    @When("the user enters username and password")
    public void inputDefaultCredentials() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
    }

    @When("the user enters {string} and {string}")
    public void inputCredentials(String userName, String passWord) {
        WebElement userField = driver.findElement(By.id("username"));
        WebElement passField = driver.findElement(By.id("password"));

        userField.clear();
        passField.clear();

        userField.sendKeys(userName);
        passField.sendKeys(passWord);
    }

    @And("clicks the submit button")
    public void submitLogin() {
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }

    @Then("get the confirmation message and verify it")
    public void validateDefaultMessage() {
        wait.until(
                ExpectedConditions.textToBePresentInElementLocated(
                        By.cssSelector("h2.mt-5"), "Welcome"
                )
        );
        String responseText = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        Assertions.assertEquals("Welcome Back, Admin!", responseText);
    }

    @Then("get the confirmation text and verify message as {string}")
    public void validateMessageFromInput(String expectedText) {
        wait.until(
                ExpectedConditions.textToBePresentInElementLocated(
                        By.cssSelector("h2.mt-5"), "Welcome"
                )
        );
        String responseText = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        Assertions.assertEquals(expectedText, responseText);
    }
}
