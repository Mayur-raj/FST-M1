package Example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
	
	public static void main(String [] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net");
		
		System.out.println("Title of the Page is:- " + driver.getTitle());
		
		driver.findElement(By.linkText("About Us")).click();
		
		System.out.println("Heading of this Page is:- " + driver.getTitle());
		
		String SubText = driver.findElement(By.tagName("h2")).getText();
		System.out.println(SubText);
		
	    driver.quit();
		
	  }

}
