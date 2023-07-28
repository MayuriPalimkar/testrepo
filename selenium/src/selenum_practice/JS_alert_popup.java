package selenum_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_alert_popup {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  //to maximize the webpage /browser
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		String text=driver.findElement(By.id("result")).getText();
		System.out.println(text);

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		
		Alert alt1 = driver.switchTo().alert();
		alt1.sendKeys("automation");
		Thread.sleep(2000);
		alt1.accept();
		String text1=driver.findElement(By.id("result")).getText();
		System.out.println(text1);

	}

}
