package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("mayuri");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("palimkar");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("palimkar");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("12345687");
		
		Thread.sleep(2000);
		
		WebElement Day = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		String DOB = "15-Mar-1995";
		String Date[] = DOB.split("-");
		//0-15
		//1-Mar
		//2-1995
		
		listbox(Day,Date[0]);
		listbox(Month,Date[1]);
		listbox(Year,Date[2]);
		
		//listbox(Day,"15");
		//listbox(Month,"03");
		//listbox(Year,"1995");
		
		
		Thread.sleep(10000);
		driver.close();
	}
	
	public static void listbox(WebElement element, String text) {
		
		Select select1 = new Select(element);
		select1.selectByVisibleText(text);
		
	}
	

}
