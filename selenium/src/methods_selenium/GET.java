package methods_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GET {
	public static void main(String [] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		Thread.sleep(3000);
		
		String URL1 = driver.getTitle();
		System.out.println(URL1);
		
		driver.navigate().to("https://www.orangehrm.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		String URl2 = driver.getCurrentUrl();
		System.out.println(URl2);
		
		String URL3 = driver.getTitle();
		System.out.println(URL3);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id =\"email\"]")).sendKeys("mayu@gmail.com");
		
		driver.quit();
	}


		
	}


