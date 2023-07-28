package locators_by_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllocators {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("mayuri@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mayuri123");
		
		driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.xpath("//button[contains(@id,\"u_0_5_Cb\")]").click();
		//Thread.sleep(5000);
		//driver.close();
}
}