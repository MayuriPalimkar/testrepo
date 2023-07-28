package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath3 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
		driver.manage().window().maximize();
		 
		driver.findElement(By.xpath("//input[@type =\"Phone number, username, or email\"]")).sendKeys("mayuri");
		
		driver.close();
		
	}
}
