package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.facebook_baseclass;

public class Tc_Facebook_login extends facebook_baseclass {
	
	public  Tc_Facebook_login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	public WebElement email;
	
	@FindBy(id = "pass")
	public WebElement password;
	
	@FindBy(xpath = "//button[@name=\"login\"]")
	public WebElement button;
	
	
	//usages
	
	public void Username(String username) {
		email.sendKeys(Username);
	}

	public void password(String Password) {
	password.sendKeys(Password);
	
	
}
	public void buttonclick() {
		button.click();
	}
}