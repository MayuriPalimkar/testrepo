package Exception_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_element_exception {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.Chrome>driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement link =driver.findElement(By.xpath("//a[contains(text(),\"Mobiles\")]"));
		link.click();
		
		driver.navigate().back();
		
		//link.click();  // org.openqa.selenium.StaleElementReferenceException:
		
		try {
		    link.click();
		}
		catch (StaleElementReferenceException e){
			
			WebElement link1 =driver.findElement(By.xpath("//a[contains(text(),\"Mobiles\")]"));
			link1.click();
			
		}
		driver.quit();

	}

}
