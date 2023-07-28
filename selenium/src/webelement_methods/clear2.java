package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear2 {
	public static void main(String [] args) throws InterruptedException {
	System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);

	WebElement username = driver.findElement(By.id("email"));
	
	username.sendKeys("mayuri@gmail.com");
	Thread.sleep(2000);
	username.clear();
	Thread.sleep(2000);
	
	WebElement password = driver.findElement(By.id("pass"));
	
	username.sendKeys("diuoisjkmn");
	password.sendKeys("123456");
	Thread.sleep(2000);
	password.clear();
	username.clear();
	Thread.sleep(2000);
	
	
	
	driver.close();
	
	
	
	
}
}