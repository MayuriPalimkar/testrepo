package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_mmt {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@name = \"username\"]")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type =\"password\"] ")).sendKeys("Password123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id= \"submit\"]")).click();
		
		
		Thread.sleep(5000);
		driver.close();
	}

}
