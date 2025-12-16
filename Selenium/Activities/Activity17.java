package Example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
    public static void main(String[] args) {
        WebDriver browser = new FirefoxDriver();
        browser.get("https://training-support.net/webelements/selects");

        System.out.println("Page title: " + browser.getTitle());

        WebElement dropdownElement = browser.findElement(By.cssSelector("select.h-80"));
        Select multiChoice = new Select(dropdownElement);

        multiChoice.selectByVisibleText("HTML");

        for (int index = 3; index <= 5; index++) {
            multiChoice.selectByIndex(index);
        }

        multiChoice.selectByValue("nodejs");

        List<WebElement> chosenItems = multiChoice.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement item : chosenItems) {
            System.out.println(item.getText());
        }

        multiChoice.deselectByIndex(4);

        chosenItems = multiChoice.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement item : chosenItems) {
            System.out.println(item.getText());
        }

        browser.quit();
    }
}
