package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/?");
		
		String exptext = "Log in to Facebook";
		String actualtext = driver.findElement(By.xpath("//div[text() ='Log in to Facebook' ]")).getText();
		System.out.println(actualtext);
		if(exptext .equals(actualtext)) {
			System.out.println("correct text");
		}
		else {
			System.out.println("incorrect text");
		}
		Thread.sleep(2000);
		
		String exptext1 = "Forgotten account";
		String actual1 = driver.findElement(By.xpath("//a[text() ='Forgotten account?' ]")).getText();
		
		if(exptext1 .equals(actual1)) {
			System.out.println("correct text");
		}
		else {
			System.out.println("incorrect text");
		}
		Thread.sleep(2000);
		
		driver.close();
		
}
}