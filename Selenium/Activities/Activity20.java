package Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver browser = new FirefoxDriver();
        browser.get("https://training-support.net/webelements/alerts");

        System.out.println("Page title: " + browser.getTitle());

        browser.findElement(By.id("prompt")).click();

        Alert promptPopup = browser.switchTo().alert();
        String popupText = promptPopup.getText();
        System.out.println("Text in alert: " + popupText);

        promptPopup.sendKeys("Awesome!");
        Thread.sleep(5000);

        promptPopup.accept();

        System.out.println(browser.findElement(By.id("result")).getText());

        browser.quit();
    }
}
