package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_methods {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		
		WebElement password = driver.findElement(By.id("pass"));
		
		username.sendKeys("mayuri@gmail.com");
		Thread.sleep(2000);
		password.sendKeys("123465");
		Thread.sleep(2000);
		
		username.clear();
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		
		Boolean button = driver.findElement(By.xpath("//button[@name=\"login\"]")).isEnabled();
		System.out.println(button);
		 Thread.sleep(2000);
		 
		 Boolean b1 = driver.findElement(By.xpath("//input[@name=\"email\"]")).isDisplayed();
		 System.out.println(b1);
		 Thread.sleep(2000);
		 
		 String expText = "Log in to FaceBook";
		 String Acttext = driver.findElement(By.xpath("//div[text()=\"Log in to Facebook\"]")).getText();
		 Thread.sleep(2000);
		 if(expText.equals( Acttext)) {
			 System.out.println("correct text");
			 
		 }
		 else {
			 System.out.println("incorrect text");
		 }
		 
		  Thread.sleep(2000);
		
		driver.close();
	}
}
