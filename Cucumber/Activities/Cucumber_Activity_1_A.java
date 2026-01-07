import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class TSHomePageSteps extends BaseClass {

    @Given("user is on the TS homepage")
    public void launchHomePage() throws Throwable {
        driver.navigate().to("https://training-support.net");
        assertEquals("Training Support", driver.getTitle());
    }

    @When("the user clicks on the About Us link")
    public void openAboutSection() throws Throwable {
        driver.findElement(By.linkText("About Us")).click();
    }

    @Then("they are redirected to another page")
    public void verifyAboutPage() throws Throwable {
        wait.until(ExpectedConditions.titleIs("About Training Support"));

        String headingText = driver.findElement(By.cssSelector("h1.text-center")).getText();
        System.out.println("New page title is: " + headingText);

        assertEquals("About Us", headingText);
    }
}
