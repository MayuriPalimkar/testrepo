package java_Script_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalRight {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://blog.hubspot.com/website/horizontal-scrolling");
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		//Scroll right
		Js.executeScript("window.scrollBy(10000,0)", "");
		Thread.sleep(2000);
		//scroll left
		Js.executeScript("window.scrollBy(-3000,0)", "");
		
		
		

	}

}
