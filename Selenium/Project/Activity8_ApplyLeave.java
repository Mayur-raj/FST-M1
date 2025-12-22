package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Activity8_ApplyLeave extends BaseTest {

    @Test
    public void applyLeaveTest() {
        login();
        driver.findElement(By.id("menu_leave_applyLeave")).click();

        new Select(driver.findElement(By.id("applyleave_txtLeaveType"))).selectByIndex(1);
        driver.findElement(By.id("applyBtn")).click();

        System.out.println("Leave applied successfully");
    }
}


