package singletonConceptInWithPageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginAccountPage {
	//WebDriver driver; // do not need 

	@FindBy(how=How.XPATH, using="//input[@id='email']") WebElement emailTextBox;
	
	@FindBy(id="pass") public WebElement locatorPass;
	
	@FindBy(how=How.XPATH, using="//a[starts-with(@id, 'u_0_2')]")  WebElement submitTextBox;
	
	public WebElement userName(String uName) {	
		emailTextBox.sendKeys(uName);
		System.out.println("username test");
		return emailTextBox;
		
	}
	
	public WebElement passWord(String pass) {
		locatorPass.sendKeys(pass);
		System.out.println("pass  test");
		return emailTextBox;
		
		
	}
	
	public WebElement submit() {
		System.out.println("submit test");
		submitTextBox.click();
		return emailTextBox;
		
	}

	
	/*
	public LoginAccountPage(WebDriver driver, WebElement emailTextBox, WebElement locatorPass,
			WebElement submitTextBox) {
		this.driver = driver;
		this.emailTextBox = emailTextBox;
		this.locatorPass = locatorPass;
		this.submitTextBox = submitTextBox;
	}
	*/

	
}


