package methods_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.orangehrm.com/");
		Thread.sleep(4000);
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(4000);
		String Title2 = driver.getTitle();
		System.out.println(Title2);
		
		
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.navigate().forward();
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
