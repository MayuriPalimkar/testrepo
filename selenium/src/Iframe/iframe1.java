package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.close();

	}

}
