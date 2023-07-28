package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_google {
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@id = 'APjFqb']")).sendKeys("good morning image");
		//driver.findElement(By.xpath("")).click();
		Thread.sleep(4000);
		
		driver.close();
		
	}

}
