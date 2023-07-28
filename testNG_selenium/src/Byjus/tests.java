package Byjus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tests {

	WebDriver driver;
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://byjus.com/learn/account/login");
		Thread.sleep(3000);
}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).sendKeys("9834194968");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(25000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//img[@alt='menu-icons/chapter_wise.png']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='d-flex flex-wrap subjects-list']//div[1]//div[1]//div[1]//img[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//p[normalize-space()='Real Numbers']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(@class,'collapse show card-body')]//a[contains(@role,'tab')][normalize-space()='Subjective Tests']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@aria-selected,'false')][normalize-space()='Objective Tests']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(3000);
		
		Boolean text =driver.findElement(By.xpath("//span[normalize-space()='Number of Questions :']")).isDisplayed();
		System.out.println(text);
		
		
		
	}
	
	
}