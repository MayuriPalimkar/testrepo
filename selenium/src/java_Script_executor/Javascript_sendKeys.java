package java_Script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_sendKeys {

	public static void main(String[] args) {
		 System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			
			//first way
			//Js.executeScript("document.getElementById('email').value='Test12';");
			//Js.executeScript("document.getElementById('pass').value='23456';");
			
			//second way
			WebElement username=driver.findElement(By.id("email"));
			WebElement password = driver.findElement(By.id("pass"));
			
			Js.executeScript("arguments[0].value='"+"test"+"';", username);
			Js.executeScript("arguments[0].value='"+"test123"+"';", password);
			
			

	}

}
