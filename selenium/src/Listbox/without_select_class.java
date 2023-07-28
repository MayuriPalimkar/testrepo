package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_select_class {

	
		public static void main(String [] args) throws InterruptedException {
			System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//a[@class = \"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("mayuri");
			driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("patil");
			driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9890175785");
			driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("abcdefgh");
			driver.findElement(By.id("day")).click();
			
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//a[@role = \"button\"]")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[@value='6']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[text()=\"Mar\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[text()=\"1995\"]")).click();
			Thread.sleep(2000);
			
			driver.close();
			
			
			
			

	}

}

