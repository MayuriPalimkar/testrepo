package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_hubspot {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("mayuri@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i18n-string[text()=\"Log in\"]")).click();
		
		Thread.sleep(5000);
		driver.close();
		
}
}