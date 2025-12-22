package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Activity7_AddQualifications extends BaseTest {

    @Test
    public void addQualificationsTest() {
        login();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.linkText("Qualifications")).click();

        driver.findElement(By.id("addWorkExperience")).click();
        driver.findElement(By.id("experience_employer")).sendKeys("ABC Corp");
        driver.findElement(By.id("btnWorkExpSave")).click();

        System.out.println("Qualification added successfully");
    }
}

