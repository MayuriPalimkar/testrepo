package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_yahoo {
public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.intl=in&specId=yidregsimplified&done=https%3A%2F%2Fwww.yahoo.com");
		
		driver.findElement(By.xpath("//input[@ id = \"usernamereg-firstName\"]")).sendKeys("mayuri palimkar");
		
		driver.findElement(By.xpath("//input[@name = \"userId\"]")).sendKeys("mayuripalimkar");
		Thread.sleep(5000);
		driver.close();
		
}
}