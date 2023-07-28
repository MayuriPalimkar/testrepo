package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byclassname {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("vfb-5")).sendKeys("student");
		
		
		Thread.sleep(5000);
		driver.close();
	}
}
