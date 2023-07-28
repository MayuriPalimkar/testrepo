package com.openMRS.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.openMRS.baseClass.baaseclass2;
import com.openMRS.baseClass.baseclass1;

public class Login_page extends baaseclass2{

	
	
	public Login_page() {     //constructor  to initialize the elements
		
		PageFactory.initElements(driver, this);
		
	}
	
	//find the elements by using locators
	
	@FindBy(xpath = "//input[@name=\"uid\"]")
	public WebElement Username;
	
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@name=\"btnLogin\"]")
	public WebElement button;
	
	
	
	
	//Action methods
	
	public void setUsername(String Uname) {
		Username.sendKeys(Uname);
		
	}
	
	public void setPassword(String Pwd) {
		Password.sendKeys(Pwd);
		
	}
	public void Clickbtn() {
		button.click();
		
	}
}
