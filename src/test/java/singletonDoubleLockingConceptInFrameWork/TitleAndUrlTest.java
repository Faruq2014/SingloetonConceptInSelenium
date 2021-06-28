package singletonDoubleLockingConceptInFrameWork;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TitleAndUrlTest extends BaseTest{
	@Test
	public void titleTest() {
		String acutualTitle="Facebook - Log In or Sign Up";
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals( acutualTitle, title, "title did not match");
	getScreenshot(driver, title);
	driver.findElement(By.id("email")).sendKeys("12345");
	driver.findElement(By.id("pass")).sendKeys("87777");
	System.out.println(" test one thread number : "+Thread.currentThread().getId());
	}
	
	@Test
	public void urlTest() {
		String acutualURL="https://www.facebook.com/";
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	Assert.assertEquals( acutualURL, URL, "title did not match");
	driver.findElement(By.id("email")).sendKeys("12345");
	driver.findElement(By.id("pass")).sendKeys("87777");
	driver.findElement(By.xpath("//a[starts-with(@id, 'u_0_2')]")).click();
	System.out.println(" test two thread number : "+Thread.currentThread().getId());
	}
}
