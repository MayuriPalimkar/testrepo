package java_Script_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownandUp1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor Js = (JavascriptExecutor) driver;//adding cast to driver
		
		//ScrollDown
		
		Js.executeScript("window.scrollBy(0,8000)", "");
		
		//ScrollUp
		Js.executeScript("window.scrollBy(0,-4000)", "");
		
		Thread.sleep(3000);
		driver.close();
		
		
		

	}

}
