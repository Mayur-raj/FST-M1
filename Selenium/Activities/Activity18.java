package Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {
    public static void main(String[] args) {
        WebDriver browser = new FirefoxDriver();
        browser.get("https://training-support.net/webelements/alerts");

        System.out.println("Page title: " + browser.getTitle());

        browser.findElement(By.id("simple")).click();

        Alert popupAlert = browser.switchTo().alert();
        String popupMessage = popupAlert.getText();
        System.out.println("Text in alert: " + popupMessage);

        popupAlert.accept();

        System.out.println(browser.findElement(By.id("result")).getText());

        browser.quit();
    }
}

