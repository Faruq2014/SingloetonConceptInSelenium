package singletoConceptInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CallSingletonDriver {
  WebDriver driver;
	@BeforeMethod
	public void openApplication() {
		InstantiateDriver	instantiationDriver=InstantiateDriver.getDriverInatance();
	driver=instantiationDriver.openBrowser();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void titleTest() {
		driver.getTitle();
	}
	
	@AfterMethod
	public void destroy(){
		driver.quit();
	}
}
