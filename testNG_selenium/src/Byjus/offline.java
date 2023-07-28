package Byjus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class offline {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	@Test
	public void logintest() throws InterruptedException {
		driver.get("https://byjus.com/");
		Thread.sleep(4000);
		
		WebElement element=driver.findElement(By.xpath("//h2[@class='trial-form-title']"));
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		Js.executeScript("arguments[0].scrollIntoView();",element);
		
		driver.findElement(By.xpath("//label[@for=\"ftc-offline\"]")).click();
		
		
		

}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}