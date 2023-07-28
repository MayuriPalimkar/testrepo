package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String URL = "https://www.facebook.com/login";
		driver.get(URL);
		
		driver.findElement(By.id("email")).sendKeys("mayuri");
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		
		driver.findElement(By.id("loginbutton")).click();
		
		driver.quit();

	}

}
