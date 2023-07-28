package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytm {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.paytm.com/register#!/signup");
		driver.manage().window().maximize();
		
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@name=\"mobileNumber\"]")).sendKeys("9890173057");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name=\"loginPassword\"]")).sendKeys("mayuri@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class=\"showPassword\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("mayuri@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Proceed\"]")).click();
		
		Thread.sleep(10000);
		driver.close();
		
		
		
		
	}

}
