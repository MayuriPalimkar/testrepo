package Com.Ecommerce.TestCases;

import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.facebook_baseclass;
import Com.Ecommerce.PageClasses.Tc_Facebook_login;

public class facebook_testcases extends facebook_baseclass {
	
	@Test
	public void fblogin() {
		
		Tc_Facebook_login TFL = new Tc_Facebook_login();
		
		TFL.Username(Username);
		logger.info("Enter the username");
		TFL.password(Password);
		logger.info("Enter the password");
		TFL.buttonclick();
		logger.info("click on the button");
		
		String title = driver.getTitle();
		logger.info(title);
	}

}
