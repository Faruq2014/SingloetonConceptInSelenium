package singletonDoubleLockingConceptInFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private static DriverManager driverInstance= null;
	private WebDriver driver;
	
	private DriverManager() {
		
	}
	
	public static DriverManager getDriverInastance() {
		if (driverInstance==null) {
			synchronized(DriverManager.class) {
			driverInstance=	new DriverManager();
			}
		}
		return driverInstance;
	}
	
	public WebDriver openBrowser(String Browser) {
		if (Browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();	
		} else if(Browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}else {
      System.out.println("this is not correct driver");
		}
		return driver;
	}
	
}
