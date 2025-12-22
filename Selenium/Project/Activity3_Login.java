package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity3_Login extends BaseTest {

    @Test
    public void loginTest() {
        login();
        boolean loggedIn = driver.findElement(By.id("welcome")).isDisplayed();
        Assert.assertTrue(loggedIn, "Login failed!");
        System.out.println("Login successful");
    }
}

