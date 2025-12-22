package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Activity1_VerifyTitle extends BaseTest {

    @Test
    public void verifyTitleTest() {
        String title = driver.getTitle();
        System.out.println("Website Title: " + title);
        Assert.assertEquals(title, "OrangeHRM", "Title does not match!");
    }
}

