package Example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity22 {
    public static void main(String[] args) {
        WebDriver browser = new FirefoxDriver();
        WebDriverWait explicitWait = new WebDriverWait(browser, Duration.ofSeconds(10));

        browser.get("https://training-support.net/webelements/popups");
        System.out.println("Page title: " + browser.getTitle());

        browser.findElement(By.id("launcher")).click();

        explicitWait.until(ExpectedConditions.elementToBeClickable(By.id("username")));

        WebElement userField = browser.findElement(By.id("username"));
        WebElement passField = browser.findElement(By.id("password"));

        userField.sendKeys("admin");
        passField.sendKeys("password");

        browser.findElement(By.xpath("//button[text()='Submit']")).click();

        String loginResult = browser.findElement(By.cssSelector("h2.text-center")).getText();
        System.out.println("Login message: " + loginResult);

        browser.quit();
    }
}
