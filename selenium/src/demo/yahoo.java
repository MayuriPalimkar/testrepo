package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class yahoo {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create?");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.xpath("//input[@id=\"usernamereg-firstName\"]")).sendKeys("mayuri");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"usernamereg-lastName\"]")).sendKeys("palimkar");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"usernamereg-userId\"]")).sendKeys("viru20111");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123@viru");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"usernamereg-show-button\"]")).click();
		Thread.sleep(1000);
		
		
		WebElement month = driver.findElement(By.xpath("//select[@name=\"mm\"]"));
		Select select1 = new Select(month);
		select1.selectByVisibleText("March");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@name=\"dd\"]")).sendKeys("15");
		
		driver.findElement(By.xpath("//input[@name=\"yyyy\"]")).sendKeys("1995");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@id=\"reg-submit-button\"]")).click();
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
}
}