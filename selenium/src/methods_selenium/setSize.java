package methods_selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setSize {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		Dimension D1 = new Dimension(800,700);
		
		driver.manage().window().setSize(D1);
		
		Thread.sleep(4000);
		
		System.out.println(driver.manage().window().getSize());
		
		Thread.sleep(4000);
		
		driver.close();
	}
}
