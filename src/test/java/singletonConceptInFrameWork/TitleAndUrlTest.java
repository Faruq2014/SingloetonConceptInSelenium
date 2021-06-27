package singletonConceptInFrameWork;

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
	}
	
	@Test
	public void urlTest() {
		String acutualURL="https://www.facebook.com/";
	String URL=driver.getCurrentUrl();
	System.out.println(URL);
	Assert.assertEquals( acutualURL, URL, "title did not match");
	}
}
