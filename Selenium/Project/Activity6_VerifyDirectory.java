package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity6_VerifyDirectory extends BaseTest {

    @Test
    public void verifyDirectoryTest() {
        login();
        driver.findElement(By.id("menu_directory_viewDirectory")).click();

        String heading = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(heading, "Search Directory", "Directory page heading mismatch");
        System.out.println("Directory page is visible and clickable");
    }
}

