package singletoConceptInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstantiateDriver {
	// variable with edt= user built data type= class data type.
private static InstantiateDriver driverInstance=null;

// instance variable with WebDriver data type
private WebDriver driver;
 // private constructor
private InstantiateDriver() {
	
}

// public static edt data type method to get access and lazy initialization.
public static InstantiateDriver getDriverInatance() {
	if (driverInstance==null) {
		driverInstance= new InstantiateDriver();
	}
	return driverInstance;
}

public WebDriver openBrowser() {
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	 return driver;
}

}
