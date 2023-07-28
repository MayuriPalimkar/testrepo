package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Boolean B1 = driver.findElement(By.xpath("//button[@name  = \"login\"]")).isEnabled();
		
		System.out.println(B1);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
