package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		

		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		WebElement element=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id("src")));
		
		element.sendKeys("Pune");
		
		WebDriverWait mywait1 = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		WebElement element1=mywait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("dest")));
		
		element1.sendKeys("Nanded");
		Thread.sleep(4000);
		driver.quit();
		
	}

}
