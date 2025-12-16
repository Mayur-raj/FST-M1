package Example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {
    public static void main(String[] args) {
        WebDriver browser = new FirefoxDriver();
        browser.get("https://training-support.net/webelements/tables");

        System.out.println("Page title: " + browser.getTitle());

        List<WebElement> headerColumns = browser.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
        System.out.println("Number of columns: " + headerColumns.size());

        List<WebElement> bodyRows = browser.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
        System.out.println("Number of rows: " + bodyRows.size());

        List<WebElement> thirdRowData = browser.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for(WebElement data : thirdRowData) {
            System.out.println(data.getText());
        }

        WebElement secondRowSecondColumn = browser.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + secondRowSecondColumn.getText());

        browser.quit();
    }
}
