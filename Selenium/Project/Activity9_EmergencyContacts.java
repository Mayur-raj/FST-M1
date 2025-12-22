package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Activity9_EmergencyContacts extends BaseTest {

    @Test
    public void emergencyContactsTest() {
        login();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.linkText("Emergency Contacts")).click();

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='emgcontact_list']//tr"));
        for (WebElement row : rows) {
            System.out.println(row.getText());
        }
    }
}


