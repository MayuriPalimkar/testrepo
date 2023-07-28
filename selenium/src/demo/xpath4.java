package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath4 {
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		Thread.sleep(4000);
		
		String title =driver.getTitle();
		
		System.out.println(title);
		
		//driver.findElement(By.xpath("//input[@value name = \"username]")).sendKeys("mayuri);
		
		driver.findElement(By.xpath("//input[@autocorrect=\"off\"]")).sendKeys("mayuri");
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[@class = \"_acan _acap _acas _aj1-\"]")).click();
		
		Thread.sleep(10000);
		
		driver.close();
		
		
	}

}
