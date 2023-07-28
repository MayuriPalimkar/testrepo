package data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Second_program {
	WebDriver driver;
	
	@BeforeMethod
	public void setuo() {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test(dataProvider="logindata")
	public void logintest(String username, String password, String Expected) throws InterruptedException {
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		WebElement email=driver.findElement(By.id("Email"));
		email.clear();
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.id("Password"));
		pass.clear();
		Thread.sleep(2000);
		
		WebElement button=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		button.click();
		
		String Expected_title= "Dashboard / nopcommerce administration";
		String act_title = driver.getTitle();
		
		if(Expected.equals("valid")) {
			
			if(Expected_title.equals(act_title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		else if(Expected.equals("Invalid")) {
			if(Expected_title.equals(act_title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
			}else {
				Assert.assertTrue(true);
			}
			
		}
		
	}
	
	@DataProvider(name  = "logindata")
	public String [][] getData(){
		String logindata [][] = {  {"admin@yourstore.com", "admin", "valid" },
			                    	{"admin@yourstore.com", "adm", "Invalid" },
			                    	{"admin@yourst.com", "admin", "Invalid" },
			                    	{"admin@yourstore1.com", "admin1", "Invalid" }  
		                           };
		return logindata;
		}
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
	

}
