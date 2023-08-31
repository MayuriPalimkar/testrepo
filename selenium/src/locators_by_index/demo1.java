package locators_by_index;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo1 {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.xpath("(//a[@class = \"nav-a  \"])[5]")).click();
		driver.get("https://www.google.com/");
		
		
		
		Thread.sleep(5000);
		
		
		driver.close();
		
}
}