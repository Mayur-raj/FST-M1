import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertStepDefinitions extends BaseClass {

    private Alert activeAlert;

    @Given("User is on the page")
    public void loadAlertPage() {
        driver.navigate().to("https://training-support.net/webelements/alerts");
    }

    @When("User clicks the Simple Alert button")
    public void triggerSimpleAlert() {
        driver.findElement(By.id("simple")).click();
    }

    @When("User clicks the Confirmation Alert button")
    public void triggerConfirmationAlert() {
        driver.findElement(By.id("confirmation")).click();
    }

    @When("User clicks the Prompt Alert button")
    public void triggerPromptAlert() {
        driver.findElement(By.id("prompt")).click();
    }

    @Then("Alert opens")
    public void captureAlert() {
        activeAlert = driver.switchTo().alert();
    }

    @And("Read the text from it and print it")
    public void displayAlertText() {
        System.out.println("Alert says: " + activeAlert.getText());
    }

    @And("Write a custom message in it")
    public void enterAlertText() {
        activeAlert.sendKeys("Custom Message");
    }

    @And("Close the alert")
    public void acceptAlert() {
        activeAlert.accept();
    }

    @And("Close the alert with Cancel")
    public void dismissAlert() {
        activeAlert.dismiss();
    }

    @And("Read the result text")
    public void displayResult() {
        String resultText = driver.findElement(By.id("result")).getText();
        System.out.println("Action performed: " + resultText);
    }
}
