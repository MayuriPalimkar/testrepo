package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains_xpath {

public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//a [contains(text(),'new account')]")).click();
		driver.findElement(By.xpath("//input[contains(@type,\"ema\")]")).sendKeys("mayuri@gmail.com");
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
}

}