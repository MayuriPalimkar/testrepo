package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_bytext1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.drive", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		Thread.sleep(4000);
		String title= driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//p[contains(text(),\"Supercharge your HR team & empower your people with powerful HR soft\")]")).click();
		
		//driver.findElement(By.xpath("//p[contains(text(),\"Per\")]")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,\"Email\")]")).sendKeys("mayuri@gmail.com");
		Thread.sleep(4000);
		driver.close();
		
	}

}
