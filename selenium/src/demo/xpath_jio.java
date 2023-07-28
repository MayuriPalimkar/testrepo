package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xpath_jio {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rechargemojo.com/mobile-recharge/landing1/jio-recharge-online");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9834194968");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class=\"OperatorForm_custom-radio-inner__7QOD_\"][2]")).click();
		
		WebElement jio = driver.findElement(By.xpath("//option[text()='Select Operator']"));
		
		Select select1 = new Select(jio);
		select1.selectByVisibleText("Jio");
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
