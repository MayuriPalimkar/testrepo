package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_login extends  Ecommerce_BaseClass{

	//private WebDriver driver;
	
	public TC_login() {
		//this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//@FindBy(xpath ="//a[text()=\"Log in\"]")
	//public WebElement login;
	
	@FindBy(id="Email")
	public WebElement email;
	
	@FindBy(id="Password")
	public WebElement password1;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	public WebElement button;
	
	
	
	//methods
	//public void loginn() {
	//	login.click();
//	}
	
	public void username(String Username) {
		email.sendKeys(Username);
	}
	
	public void pass(String Password) {
		password1.sendKeys(Password);
		
	}
	public void buttonclick() {
		button.click();
	}
	
}
