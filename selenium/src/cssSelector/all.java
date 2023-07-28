package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class all {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.manage().window().maximize();
		//1. By id
		//driver.findElement(By.id("login-username")).sendKeys("mayuri");
		//driver.findElement(By.id("login-signin")).click();
		
		//2.By name
	//	driver.findElement(By.name("username")).sendKeys("mayuri");
	//	driver.findElement(By.name("signin")).click();
		
		//3. by classname
		//driver.findElement(By.className("phone-no")).sendKeys("mayuri");
		//driver.findElement(By.className("pure-button")).click();
		
		//4.By linkText
		//driver.findElement(By.linkText("Forgotten username?")).click();
		
		//5.By partialLinkText
		//driver.findElement(By.partialLinkText("Create")).click();
		
		//6.By cssSelector
		//driver.findElement(By.cssSelector("#login-username")).sendKeys("mayuri");
		//driver.findElement(By.cssSelector("#login-signin")).click();
		
		//driver.findElement(By.cssSelector("input#login-username")).sendKeys("mayuri");
		//driver.findElement(By.cssSelector("input#login-signin")).click();
		
		
		//driver.findElement(By.cssSelector("input[id=\"login-username\"]")).sendKeys("mayuri");
		//driver.findElement(By.cssSelector("input[id=\"login-signin\"]")).click();
		
		//7.By xpath
	//	driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("mayuri@yahoo.com");
		//driver.findElement(By.cssSelector("//input[@id=\"login-signin\"]")).click();
		
		//driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("mayuri@yahoo.com");
        // driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),\"account\")]")).click();
		
		Thread.sleep(4000);
		driver.close();
	}

}
