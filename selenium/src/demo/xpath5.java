package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		
		driver.findElement(By.xpath("//input[@id = \"username\"]")).sendKeys("mayuri@gmail.com");
		driver.findElement(By.xpath("//input[@id = \"password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//span [@id =\"password-visibility-toggle\"]")).click();
		//driver.findElement(By.xpath("//button [@class =\"btn__primary--large from__button--floating\"]")).click();
		
		
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
