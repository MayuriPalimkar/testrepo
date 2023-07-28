package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_page {
	
	WebDriver driver;
	//1. declaration
	public Dashboard_page(WebDriver driver) {
		this.driver = driver;
	//initialization	
		PageFactory.initElements(driver, this);
	}
	//findElements
	@FindBy(xpath = "//p[@class=\"oxd-userdropdown-name\"]")
	private WebElement name;
	
	@FindBy(xpath = "//p[@class=\"oxd-text oxd-text--p\"]")
	WebElement time;
	
	//3.usage
	public void NameValidation() {
		String text = name.getText();
		if(text.equals("Paul Collings")) {
			System.out.println("Correct username");
		}
	}
	public void TimeAt() {
		Boolean Time1=time.isDisplayed();
		System.out.println(Time1);
	}
	

}
