package java_Script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByElements {

	public static void main(String[] args) {
System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		WebElement name =driver.findElement(By.xpath("//h2[text()=\"Machine Learning\"]"));

		//ScrollBy element
		Js.executeScript("arguments[0].scrollIntoView();", name);
		
	}

}
