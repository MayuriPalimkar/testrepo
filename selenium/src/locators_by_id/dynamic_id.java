package locators_by_id;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_id {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//dynamic id
		//contains by xpath
		
		//driver.findElement(By.xpath("//button[contains(@id,\"u_0_5\")]")).click();
		
		//starts-with
		//driver.findElement(By.xpath("//button[starts-with(@id,\"u_0_5_\")]")).click();
		
		//ends-with
		
	//	driver.findElement(By.xpath(""))
		driver.close();
}
}