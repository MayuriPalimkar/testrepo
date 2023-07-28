package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("mayuri@gmail.com");  //#id
		
		//driver.findElement(By.cssSelector("input#pass")).sendKeys("123456");   //input#id
		
		//driver.findElement(By.cssSelector("button[value=\"1\"]")).click();    //by tagname[attributename = value]
		
		driver.findElement(By.cssSelector("input.inputtext[type=\"text\"]")).sendKeys("mayuri@gmail.com");
		
		driver.findElement(By.cssSelector("input.inputtext[type=\"password\"]")).sendKeys("123456"); 
		
		driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy")).click();
		
}
}