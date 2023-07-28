package java_Script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightlightBorder {

	public static void main(String[] args) {
		 System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			WebElement element1 = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
			WebElement element2 = driver.findElement(By.id("email"));
			
			
			JavascriptExecutor Js = (JavascriptExecutor) driver;
			
			Js.executeScript("arguments[0].style.border='15px solid red'", element1);
			Js.executeScript("arguments[0].style.border='5px solid green'", element2);

	}

}
