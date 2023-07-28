package methods_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quit {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		 driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM,Inc')]")).click();
		 Thread.sleep(4000);
		 
		 driver.quit();
		
	}

}
