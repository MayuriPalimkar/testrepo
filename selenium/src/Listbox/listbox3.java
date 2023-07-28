package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox3 {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/campaign/landing.php?");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("mayuri");
		
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("handre");
		
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9890176548");
		
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("989@viru");
		
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
		
		WebElement month = driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
		
		WebElement year = driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		
		String DOB = "15/Mar/1995";
		
		String date[] = DOB.split("/");
		//0-15
		//1-03
		//2-1995
		listbox(day,date[0]);
		listbox(month,date[1]);
		listbox(year,date[2]);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value=\"1\"]")).click();
		
		driver.findElement(By.xpath("//button[@name = \"websubmit\"]")).click();
		
		Thread.sleep(10000);
		driver.close();
		
		
		
		
		
		
		
		
}
	
	
	
	public static void listbox(WebElement element, String text) {
		Select select1 = new Select(element);
		select1.selectByVisibleText(text);
		
		
		
	}
}