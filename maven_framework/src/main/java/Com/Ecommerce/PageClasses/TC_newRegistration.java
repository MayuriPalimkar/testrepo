package Com.Ecommerce.PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_newRegistration {

	
	private WebDriver driver;


	//public WebDriver driver;


	public TC_newRegistration(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//button[contains(text(),\"Register\")]")
	public WebElement login;
	
	@FindBy(id = "gender-female")
	public WebElement genderfemale;
	
	@FindBy (id ="FirstName")
	public WebElement firstname;
	
	@FindBy (id = "LastName")
	public WebElement lastname;
	
	@FindBy( id = "Email")
	public WebElement email;
	
	@FindBy (id = "Password")
	public WebElement password;
	
	@FindBy (id = "ConfirmPassword")
	public WebElement confirmpass;
	
	@FindBy (id = "register-button")
	public WebElement reg;
	
	@FindBy( xpath = "//div[contains(text(),\"Your registration completed\")]")
	public WebElement text;
	
	
	public void newReg() {
		login.click();
		
	}
	
	public void selectGender() {
		genderfemale.click();
	}
	
	public void fname(String name) {
		firstname.sendKeys(name);
	}
	
	public void lname(String name1) {
		lastname.sendKeys(name1);
	}
	
	public void email(String Email) {
		email.sendKeys(Email);
	}
	public void pass(String pass1) {
		password.sendKeys(pass1);
	}
	
	public void cpass(String cpass) {
		confirmpass.sendKeys(cpass);
	}
	public void button() {
		reg.click();
	}
	public void verify() {
		String textverify =text.getText();
		System.out.println(textverify);
	}
	
	
	
	
}
