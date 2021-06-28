package singletonConceptInWithPageObjectModel;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	private static BrowserFactory singletonBrowser=null;
	private WebDriver driver;

private BrowserFactory() {
	
}

public static BrowserFactory getBrowser() {
	if (singletonBrowser==null) {
		synchronized(BrowserFactory.class){
		singletonBrowser=new BrowserFactory();
		}
	}
	return singletonBrowser;
}
public  WebDriver  openBrowser(String browser) {
	if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	}else {System.out.println("only chrome driver allow");}
	return driver;
}
}