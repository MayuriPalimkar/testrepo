package methods_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		 Thread.sleep(5000);
		 
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.close();
		
		String ExpectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if (Title.equals(ExpectedTitle)) {
			System.out.println("correct Title");
			
		}
		else {
			System.out.println("incorrect title");
		}
		
	}
}
