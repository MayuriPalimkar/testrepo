package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//textarea[@class =\"gLFyf\"]")).sendKeys("good morning images");
		
		driver.findElement(By.xpath("//textarea[@class =\"gLFyf\"]")).click();
		driver.findElement(By.xpath("//textarea[@class =\"gLFyf\"]")).click();
		
		
		Thread.sleep(8000);
		
		driver.close();
	}
}
