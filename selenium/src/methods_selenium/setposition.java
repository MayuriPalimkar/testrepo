package methods_selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setposition {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/");
		 Point p1 = new Point(500,300);
		
		driver.manage().window().setPosition(p1);
		System.out.println(p1);
		Thread.sleep(4000);
		
	System.out.println(driver.manage().window().getPosition());
		
		driver.close();
	}
}
