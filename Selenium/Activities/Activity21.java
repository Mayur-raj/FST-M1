package Example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity21 {
    public static void main(String[] args) {
        WebDriver browser = new FirefoxDriver();
        WebDriverWait explicitWait = new WebDriverWait(browser, Duration.ofSeconds(10));

        browser.get("https://training-support.net/webelements/tabs");
        System.out.println("Page title: " + browser.getTitle());
        System.out.println("Current tab: " + browser.getWindowHandle());

        explicitWait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[text()='Open A New Tab']"))
        ).click();

        explicitWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("Currently open windows: " + browser.getWindowHandles());

        for (String windowId : browser.getWindowHandles()) {
            browser.switchTo().window(windowId);
        }

        explicitWait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(text(), 'Another One')]"))
        );

        System.out.println("Current tab: " + browser.getWindowHandle());
        System.out.println("New Page title: " + browser.getTitle());
        System.out.println(
                "New Page message: " +
                browser.findElement(By.cssSelector("h2.mt-5")).getText()
        );

        browser.findElement(By.xpath("//button[contains(text(), 'Another One')]")).click();

        explicitWait.until(ExpectedConditions.numberOfWindowsToBe(3));

        for (String windowId : browser.getWindowHandles()) {
            browser.switchTo().window(windowId);
        }

        browser.quit();
    }
}
