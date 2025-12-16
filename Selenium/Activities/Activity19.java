package Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {
        WebDriver browser = new FirefoxDriver();
        browser.get("https://training-support.net/webelements/alerts");

        System.out.println("Page title: " + browser.getTitle());

        browser.findElement(By.id("confirmation")).click();

        Alert confirmationPopup = browser.switchTo().alert();
        String confirmationText = confirmationPopup.getText();
        System.out.println("Text in alert: " + confirmationText);

        confirmationPopup.accept();

        System.out.println(browser.findElement(By.id("result")).getText());

        browser.quit();
    }
}
