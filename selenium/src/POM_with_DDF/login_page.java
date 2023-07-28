package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {

	WebDriver driver;
	public login_page (WebDriver driver) {
		
		//initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	//pagefactory
	@FindBy(xpath="//input[@name=\"username\"]")
	public WebElement usermail;
	
	//WebElement usermail = driver.findElement(By.id("username"));
	
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	public WebElement button;
	
	//usage
	public void Usermail(String email) {
		usermail.sendKeys(email);
	}

	public void password1(String pass) {
		password.sendKeys(pass);
	}
	public void login() {
		button.click();
	}
	public void GoTo() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
}
