package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsAll_popup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		Boolean text=driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
		
		System.out.println(text);
		driver.close();*/
		
		/*driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		Boolean text=driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.close();     */
		
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		
		alert.sendKeys("Automation");
		Thread.sleep(2000);
		
		alert.accept();
		
		Boolean text=driver.findElement(By.xpath("//p[@id=\"result\"]")).isDisplayed();
		
		System.out.println(text);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
