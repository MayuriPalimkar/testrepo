package khan_academy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
	       driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get("https://www.khanacademy.org/login");
	      Thread.sleep(2000);
	}
	
	@Test
	public void log_in() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='login-or-signup']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='uid-login-form-0-wb-id-identifier-field']")).sendKeys("palimkarmayuri153@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='uid-labeled-text-field-1-wb-id-field']")).sendKeys("mayuri153");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@role='button']")).click();
		
		Thread.sleep(2000);
		
		//boolean uname=driver.findElement(By.xpath("//span[@class='_wozql4 _13hnk7qk']")).isDisplayed();
	//	System.out.println(uname);
		//Thread.sleep(5000);
	}
	@AfterMethod
	public void Tear_down() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='_wozql4 _13hnk7qk']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Log out']")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
