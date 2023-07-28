package java_Script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_action {

	public static void main(String[] args) {
		 System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			

			WebElement username=driver.findElement(By.id("email"));
			WebElement password = driver.findElement(By.id("pass"));
			WebElement loginButton = driver.findElement(By.xpath("//button[@name=\"login\"]"));
			
			Js.executeScript("arguments[0].value='"+"test"+"';", username);
			Js.executeScript("arguments[0].value='"+"test123"+"';", password);
			Js.executeScript("arguments[0].click()", loginButton);
			
	}

}
