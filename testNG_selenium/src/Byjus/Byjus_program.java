package Byjus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Byjus_program {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// driver.get("https://byjus.com/");

		// Thread.sleep(2000);

		// driver.findElement(By.xpath("//a[@class=\"primary-login-btn\"]")).click();

		//input[@placeholder='Enter your mobile number']
		// driver.switchTo().frame("class="login-content-body");
		driver.get("https://byjus.com/learn/account/login");

		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("8626078177");
		Thread.sleep(15000);
		

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		Thread.sleep(20000);

		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		
		Thread.sleep(20000);

		
		boolean name = driver.findElement(By.xpath("//span[@title='Mayuri Palimkar']")).isDisplayed();
		System.out.println(name);

	}

}
