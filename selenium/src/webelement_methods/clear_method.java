package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("mayuri@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("mayuri@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("email")).clear();
		
		Thread.sleep(4000);
		driver.close();
		

	}

}
