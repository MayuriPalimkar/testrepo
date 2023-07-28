package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_class1 {

	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/campaign/landing.php");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@class=\"inputtext _58mg _5dba _2ph-\"]")).sendKeys("Mayuri");
		driver.findElement(By.xpath("//input[@name= \"lastname\"]")).sendKeys("Palimkar");
		driver.findElement(By.xpath("//input[@name= \"reg_email__\"]")).sendKeys("Palimkar@gmail.com");
		driver.findElement(By.xpath("//input[@id= \"password_step_input\"]")).sendKeys("123456");
		
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		//select by visible text
		
	/*	Select select1 = new Select(Day);
		select1.selectByVisibleText("4");
		
		Select select2 = new Select(Month);
		select2.selectByVisibleText("Mar");
		
		Select select3 = new Select(year);
		select3.selectByVisibleText("2019");*/
		
		//select by value
		
		/*Select select4 = new Select(Day);
		select4.selectByValue("4");
		
		Select select5 = new Select(Month);
		select5.selectByValue("3");
		
		Select select6 = new Select(year);
		select6.selectByValue("2019");*/
		
		
		//select by index
		
		Select select7 = new Select(Day);
		select7.selectByIndex(3);
		
		Select select8 = new Select(Month);
		select8.selectByIndex(2);
		
		Select select9 = new Select(year);
		select9.selectByIndex(4);
		
		
		
		
		
		
		
		Thread.sleep(6000);
		driver.close();
		
		
		
		
		
	}
}
