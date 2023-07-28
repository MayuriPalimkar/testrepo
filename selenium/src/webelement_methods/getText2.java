package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText2 {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		String exptext = "Forgot password?";
		
		String acttext = driver.findElement(By.xpath("//a[contains(text(),\"Forgot password\")]")).getText();
		Thread.sleep(2000);
		System.out.println(acttext);
		
		if (exptext.equals(acttext)) {
			System.out.println("correct text");
		}
		else {
			System.out.println("incorrect text");
		}
		
		Thread.sleep(4000);
		driver.quit();
	}

}
