package Byjus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class book_a_free_session {

	WebDriver driver;
	
	public void setup() throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://byjus.com/btc/");
		Thread.sleep(3000);
	}
	
	public void book_session() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@class=\"counselling-btn\"]")).click();
		
		WebElement name =driver.findElement(By.xpath("//button[@class=\"counselling-btn\"]"));
		
		name.sendKeys("Viransh H");
		Thread.sleep(2000);
        WebElement number =driver.findElement(By.xpath("//input[@name=\"mobile\"]"));
		
		name.sendKeys("9834194968");
		Thread.sleep(20000);
		
		
	}

	}

