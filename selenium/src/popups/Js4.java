package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id=\"login1\"]")).sendKeys("test");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		String ExpectedAlert="Please enter your password";
		
		Alert alert=driver.switchTo().alert();
		
		String ActualString =alert.getText();
		
		if(ExpectedAlert.equals(ActualString)) {
			System.out.println("correct alert");
		}
		else {
			System.out.println("Incorrect alert");
		}
		alert.accept();
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
