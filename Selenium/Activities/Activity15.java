package Example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {
    public static void main(String[] args) {
        WebDriver browser = new FirefoxDriver();
        WebDriverWait explicitWait = new WebDriverWait(browser, Duration.ofSeconds(10));

        browser.get("https://training-support.net/webelements/dynamic-attributes");
        System.out.println("Page title is: " + browser.getTitle());

        WebElement nameField = browser.findElement(By.xpath("//input[starts-with(@id, 'full-name')]"));
        WebElement emailField = browser.findElement(By.xpath("//input[contains(@id, '-email')]"));
        WebElement dateField = browser.findElement(By.xpath("//input[contains(@name, '-event-date-')]"));
        WebElement detailsField = browser.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]"));

        nameField.sendKeys("Raiden Shogun");
        emailField.sendKeys("raiden@electromail.com");
        dateField.sendKeys("2025-06-26");
        detailsField.sendKeys("It will be electric!");

        browser.findElement(By.xpath("//button[text()='Submit']")).click();

        String confirmationText = explicitWait
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")))
                .getText();
        System.out.println("Success message: " + confirmationText);

        browser.quit();
    }
}
