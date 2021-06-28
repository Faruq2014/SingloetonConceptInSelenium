package singletonConceptInWithPageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class BaseTest {
public static WebDriver driver;

@BeforeTest
public void openApplication() {
	BrowserFactory	inatiateBrowser=BrowserFactory.getBrowser();
	driver=inatiateBrowser.openBrowser("chrome");
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

}
}
