package methods_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSize {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com");
		
		Thread.sleep(4000);
		
	/*	driver.manage().window().maximize();
		
		Thread.sleep(2000);*/
		
		System.out.println(driver.manage().window().getSize());
		
		driver.close();
	}

}
