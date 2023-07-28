package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_js1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		Boolean text=driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
		
		System.out.println(text);
		driver.quit();
		

	}

}
