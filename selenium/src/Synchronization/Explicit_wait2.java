package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait2 {

	public static void main(String[] args) {
		

		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		By input1 = By.id("src");
		Waitforelement(driver,input1,30).sendKeys("Nanded");
		
		By input2 = By.id("dest");
		Waitforelement(driver,input2,30).sendKeys("Pune");
		
		driver.quit();
		
	}
	public static WebElement Waitforelement(WebDriver driver,By Locator, int timeout) {
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
		
		mywait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		
		
		return driver.findElement(Locator);
		
		
		
		
		
	}

}
