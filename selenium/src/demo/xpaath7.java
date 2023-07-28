package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaath7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome,driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com/?.intl=in");
		String title = driver.getTitle();
		System.out.println(title);
     //driver.findElement(By.xpath("//input[@id = \"login-username\"]")).sendKeys("mayuri123");
		//driver.findElement(By.linkText("Forgotten username?")).click();
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//driver.findElement(By.linkText("Create an account")).click();
		driver.findElement(By.partialLinkText("Create ")).click();
		Thread.sleep(5000);
		driver.close();
	}

}