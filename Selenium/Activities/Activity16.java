package Example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
    public static void main(String[] args) {
        WebDriver browser = new FirefoxDriver();
        browser.get("https://training-support.net/webelements/selects");

        System.out.println("Page title is: " + browser.getTitle());

        WebElement selectElement = browser.findElement(By.cssSelector("select.h-10"));
        Select dropdownMenu = new Select(selectElement);

        dropdownMenu.selectByVisibleText("Two");
        System.out.println("Second option: " + dropdownMenu.getFirstSelectedOption().getText());

        dropdownMenu.selectByIndex(3);
        System.out.println("Third option: " + dropdownMenu.getFirstSelectedOption().getText());

        dropdownMenu.selectByValue("four");
        System.out.println("Fourth option: " + dropdownMenu.getFirstSelectedOption().getText());

        List<WebElement> optionList = dropdownMenu.getOptions();
        System.out.println("Options in the dropdown: ");
        for (WebElement item : optionList) {
            System.out.println(item.getText());
        }

        browser.quit();
    }
}

