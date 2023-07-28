package Testng_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_ddf {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver", 
				"C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");

		WebDriver driver = new ChromeDriver();

		//Implicitly Wait 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//To maximize browser
		driver.manage().window().maximize();

		//To enter url/ open kite application
		driver.get("https://kite.zerodha.com/");
		
		//To enter UN
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");

		//To enter PWD
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijay@123");
		
		//To click on login
		driver.findElement(By.xpath("//button[text()='Login ']")).click();


	}

}
