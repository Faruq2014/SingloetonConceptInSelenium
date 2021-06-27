package singletonConceptInFrameWork;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
WebDriver driver;
@BeforeTest
public void openApplication() {
	DriverManager instanceDriverExe=DriverManager.getDriverInastance();
	driver=instanceDriverExe.openBrowser("chrome");
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
}

public static String getScreenshot(WebDriver driver, String screenShotName) {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);

	String path = System.getProperty("user.dir") + "/Screenshot/" + System.currentTimeMillis() + ".png";
	
	File destination = new File(path);
	try {
		FileUtils.copyFile(src, destination);
	} catch (IOException e) {
		System.out.println("Capture Failed " + e.getMessage());
	}
	return path;

}

@AfterTest
public void destoryBrowser() {
	driver.quit();
}
}
