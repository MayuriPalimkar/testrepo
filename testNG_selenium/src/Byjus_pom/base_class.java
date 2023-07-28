package Byjus_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class base_class {
	
	WebDriver driver;
	
	public base_class(WebDriver driver) {
		
	this.driver = driver;
	PageFactory.initElements(driver, this);
		
	}
	
	//book session
	@FindBy(xpath = "//button[@class=\"counselling-btn\"]")
	WebElement book_session;
	
	
	//name
	@FindBy(xpath="//input[@name=\"name\"]")
	WebElement name;
	
	//mob number
	@FindBy(xpath = "//input[@name=\"mobile\"]")
	WebElement mobnumber;
	
	// send otp
	@FindBy(xpath = "//button[@class=\"otp-btn\"]")
	WebElement otp;
	
	//otp_click
	@FindBy(xpath = "//input[@name=\"otp\"]")
	WebElement otp_button;
	
	//select_city
	@FindBy(xpath="//select[@id=\"formCity\"]")
	WebElement city;
	
	//select center
	@FindBy(xpath = "//select[@name=\"centername\"]")
	WebElement center;
	
	//select class 
	@FindBy(xpath = "//input[@id=\"class-five\"]")
	WebElement selectclass;
	
	//submit button
	@FindBy(xpath = "//button[text()=\"Submit\"]")
	WebElement submit;
	
	
	//methods
	
	//hit url
	public void Go_To() throws InterruptedException {
		driver.get("https://byjus.com/btc/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
		Thread.sleep(3000);
	}
	
	//book a session
	public void session() throws InterruptedException {
		book_session.click();
		Thread.sleep(2000);
	}
	
	
	
	
	//name 
	public void MyName() {
		name.sendKeys("Mayuri");
		
	}
	
	//phone number
	public void number() throws InterruptedException {
		mobnumber.sendKeys("9834194968");
		Thread.sleep(2000);
	}
	public void send_otp1() throws InterruptedException {
		otp.click();
		Thread.sleep(20000);
	}
	
	//public void otp_click() throws InterruptedException {
	//	otp_button.click();
	//	Thread.sleep(20000);
	//}
	
	public void city1() throws InterruptedException {
		city.click();
		Select s1 = new Select(city);
		s1.selectByVisibleText(" Delhi");
		Thread.sleep(2000);
	}
	
	public void center1() throws InterruptedException {
		center.click();
		Select s2 = new Select (center);
		s2.selectByVisibleText(" Delhi-Dabri Road");
		Thread.sleep(2000);
	}
	
	public void grade() {
		selectclass.click();
	}
	
	public void submit() {
		submit.click();
	}
	

}
