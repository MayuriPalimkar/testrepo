package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselector1 {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/");
		String title = driver.getTitle();
		System.out.println(title);
		//1. by id
	//	driver.findElement(By.cssSelector("#username")).sendKeys("mayuri@gmail.com");
		
		//driver.findElement(By.cssSelector("#password")).sendKeys("12345");
		
	//	driver.findElement(By.cssSelector("#loginBtn")).click();
		
		//2.Tagname and Id
		
	//	driver.findElement(By.cssSelector("input#username")).sendKeys("mayuri@gmail.com");
		
	//	driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
	
	//	driver.findElement(By.cssSelector("button#loginBtn")).click();
		
		//3.tagnaame and attribute
		
	//  driver.findElement(By.cssSelector("input[id =\"username\"]")).sendKeys("mayuri@gmail.com");
		
	//	driver.findElement(By.cssSelector("input[id =\"password\"]")).sendKeys("123456");
		
	//	driver.findElement(By.cssSelector("button[id =\"loginBtn\"]")).click();
		
		//tagname inputtext and attribute
		
		 driver.findElement(By.cssSelector("input[type= \"email\"]")).sendKeys("mayuri@gmail.com");
		
		 driver.findElement(By.cssSelector("input.form-control.private-form__control.login-password.m-bottom-3")).sendKeys("123456");
		 
		 driver.findElement(By.cssSelector("button.uiButton.private-button.private-button--primary.private-button--default.m-bottom-4.login-submit.disabled"
		 		+ "")).click();
		
		Thread.sleep(4000);
		driver.close();
	}

}
