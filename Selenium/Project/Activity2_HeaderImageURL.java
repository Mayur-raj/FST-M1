package Test;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Activity2_HeaderImageURL extends BaseTest {

    @Test
    public void headerImageURLTest() {
        String headerURL = driver.findElement(By.xpath("//img[@alt='OrangeHRM']"))
                .getAttribute("src");
        System.out.println("Header Image URL: " + headerURL);
    }
}
