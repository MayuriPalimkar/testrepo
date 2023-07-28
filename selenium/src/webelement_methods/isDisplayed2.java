package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed2 {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/?");
		
		WebElement input = driver.findElement(By.xpath("//input[@id = \"email\"]"));
		
		//input.sendKeys("mayuti@gmail.com");
		//Thread.sleep(2000);
		System.out.println(input.isDisplayed());
		Thread.sleep(2000);
		
		
		
		
		
		driver.close();
		
		
		
}
}