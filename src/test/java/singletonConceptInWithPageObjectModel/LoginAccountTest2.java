package singletonConceptInWithPageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginAccountTest2 extends BaseTest{
	@Test()
	public void loginTest() {
		LoginAccountPage	 lap=PageFactory.initElements(driver, LoginAccountPage.class);
		//LoginAccountPage lap=PageFactory.initElements(driver, LoginAccountPage.class);
	    lap.userName("sajid");
	    lap.passWord("1234");
	    lap.submit();
	    System.out.println("i am login test");
	}
}
