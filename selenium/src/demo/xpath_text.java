package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_text {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/i/flow/login");
		String str = driver.getTitle();
		System.out.println(str);
		
		driver.findElement(By.xpath("//div[@id =\"react-root\"]")).sendKeys("mayuri");
		
		Thread.sleep(4000);
		driver.close();
		
	}

}
