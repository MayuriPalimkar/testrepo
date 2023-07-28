package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@name =\"username\"]")).sendKeys("mayuri@gmail.com");
		
		driver.findElement(By.xpath("//input[@type =\"password\"]")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class =\"_acan _acap _acas _aj1-\"]")).click();
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
}
}