package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Activity4_AddEmployee extends BaseTest {

    @Test
    public void addEmployeeTest() {
        login();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("btnAdd")).click();

        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        driver.findElement(By.id("btnSave")).click();

        System.out.println("Employee added successfully");
    }
}


