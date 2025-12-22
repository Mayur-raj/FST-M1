package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Activity5_EditMyInfo extends BaseTest {

    @Test
    public void editMyInfoTest() {
        login();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("btnSave")).click(); // Enable edit

        driver.findElement(By.id("personal_optGender_1")).click(); // Gender
        new Select(driver.findElement(By.id("personal_cmbNation"))).selectByVisibleText("Indian");
        driver.findElement(By.id("personal_DOB")).sendKeys("1995-01-01");

        driver.findElement(By.id("btnSave")).click();
        System.out.println("User information updated successfully");
    }
}
