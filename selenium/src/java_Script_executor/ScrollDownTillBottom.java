package java_Script_executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownTillBottom {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//ScrollUp
		js.executeScript("window.scrollBy(0,document.body.scroolHeight)","");
		
		Thread.sleep(4000);
		
		js.executeScript("document.documentElement.scrollTop=0","");
		

	}

}
