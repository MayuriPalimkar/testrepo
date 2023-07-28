package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_redbus {
	
public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//* [text()='SEARCH BUSES']")).click();
		
		//xpath by attribute
		driver.findElement(By.xpath("//input[@tabindex = '1']")).sendKeys("pune");
		//driver.findElement(By.xpath("//input[@tabindex = '1']")).click();
		//xpath by text
		//driver.findElement(By.xpath("//* [text() = \"To\"]")).click();
		//driver.findElement(By.xpath("//* [text() = \"To\"]")).sendKeys("narsi");
		
		//xpath by text
		driver.findElement(By.xpath("//* [text() = \"Date\"]")).click();
		
		
		
		Thread.sleep(4000);
		driver.close();
		

}
}