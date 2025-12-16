package Example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {
    public static void main(String[] args) {
        WebDriver browser = new FirefoxDriver();
        browser.get("https://training-support.net/webelements/tables");

        System.out.println("Page title: " + browser.getTitle());

        List<WebElement> tableHeaders = browser.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
        System.out.println("Number of columns: " + tableHeaders.size());

        List<WebElement> tableRows = browser.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
        System.out.println("Number of rows: " + tableRows.size());

        WebElement bookTitleBeforeSort = browser.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]"));
        System.out.println("Book name before sorting: " + bookTitleBeforeSort.getText());

        browser.findElement(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th[5]")).click();

        WebElement bookTitleAfterSort = browser.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]"));
        System.out.println("Book Name after sorting: " + bookTitleAfterSort.getText());

        browser.quit();
    }
}
