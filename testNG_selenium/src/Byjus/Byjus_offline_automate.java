package Byjus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Byjus_offline_automate {
	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://byjus.com/");
		Thread.sleep(3000);
	}

	@Test
	public void Test() throws InterruptedException {
		JavascriptExecutor JS = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath("//h2[@class='trial-form-title']"));

		JS.executeScript("arguments[0].scrollIntoView();", element);

		driver.findElement(By.xpath("//input[@id='ftc-offline']")).click();

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mayuri Patil");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9834194968");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
		Thread.sleep(20000);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("palimkarmayuri@gmail.com");

		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		Select s1 = new Select(state);
		s1.selectByVisibleText("Maharashtra");
		
		WebElement class1=driver.findElement(By.xpath("//select[@name='grade']"));
		Select s2 = new Select(class1);
		s2.selectByVisibleText("Class 10");
		
		
		
		driver.findElement(By.xpath("//button[@id='ftcOfflineScheduleClass']")).click();
		Thread.sleep(4000);
		
		WebElement city = driver.findElement(By.xpath("//select[@name='city-offline']"));
		
		Select s3 = new Select(city);
		s3.selectByVisibleText("Thane");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@placeholder='Select Date']")).click();
		//Thread.sleep(15000);
		
		WebElement Center=driver.findElement(By.xpath("//select[@name='center-offline']"));
		Select s4 = new Select(Center);
		s4.selectByVisibleText("None of the Above");
		
		Thread.sleep(2000);
		
	//	WebElement time=driver.findElement(By.xpath("//select[@name='slot-offline']"));
		
	//	Select s5 = new Select(time);
	//	s5.selectByVisibleText("12 PM - 2 PM");
	//	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='schedule-online-session-btn-no-center']")).click();
		Thread.sleep(4000);
		
		String text=driver.findElement(By.xpath("//p[text()=\"Booking Successful!\"]")).getText();
		System.out.println(text);
	
	}
	@AfterMethod
	public void Tear_down() {
		driver.quit();
	}

}
