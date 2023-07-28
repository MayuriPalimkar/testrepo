package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.linkedin.com/login");
		
		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();
		driver.findElement(By.xpath("//a [@id = \"back-button-password-reset\"]")).click();
		
		driver.findElement(By.xpath("//a[contains @id, \"join_now\"]")).click();
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
