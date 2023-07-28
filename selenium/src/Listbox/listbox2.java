package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox2 {
	
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@id = \"usernamereg-firstName\"]")).sendKeys("Mayuri");
		driver.findElement(By.xpath("//input[@id = \"usernamereg-lastName\"]")).sendKeys("Palimkar");
		driver.findElement(By.xpath("//input[@name = \"userId\"]")).sendKeys("mayuripalimkar");
		driver.findElement(By.xpath("//input[@id=\"usernamereg-password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@id=\"usernamereg-show-button\"]")).click();
		
		WebElement month = driver.findElement(By.name("mm"));
		driver.findElement(By.name("dd")).sendKeys("15");
		Select  select1 = new Select(month);
		select1.selectByVisibleText("March");
		driver.findElement(By.name("yyyy")).sendKeys("1995");
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
