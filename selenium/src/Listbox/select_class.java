package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_class {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("mayuri");
		driver.findElement(By.name("lastname")).sendKeys("palimkar");
		
		driver.findElement(By.name("reg_email__")).sendKeys("mayuri@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		
		WebElement Day = driver.findElement(By.id("day"));
		
		WebElement Month = driver.findElement(By.id("month"));
		
		WebElement Year = driver.findElement(By.id("year"));
		
		Select select1 = new Select(Day);
	
		//selectByVisibleText(String text)
		
		select1.selectByVisibleText("15");
		
		Select select2 = new Select(Month);
		
		//selectByVisibleText(String Text)
		
		select2.selectByVisibleText("Mar");
		
		Select select3 = new Select(Year);
		
		select3.selectByVisibleText("1995");
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}

}
