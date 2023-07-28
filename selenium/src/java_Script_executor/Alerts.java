package java_Script_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.amazon.in/");
			
			WebElement account=driver.findElement(By.xpath("//span[contains(text(),\"Account & Lists\")]"));
			
			Actions act = new Actions(driver);
			
			act.moveToElement(account).build().perform();
			
			driver.findElement(By.xpath("(//span[text()=\"Sign in\"  and  @class=\"nav-action-inner\"])[1]")).click();
			
			driver.findElement(By.id("ap_email")).sendKeys("velocity@gmail.com");
			
			driver.findElement(By.id("continue")).click();
			
			driver.findElement(By.id("ap_password")).sendKeys("123456");
			
			driver.findElement(By.id("signInSubmit")).click();
			
			Thread.sleep(3000);
			
			Boolean text=driver.findElement(By.xpath("//span[@class=\"a-list-item\"]")).isDisplayed();
			
			System.out.println(text);
			
			Alerts.generatealerts(driver, "There is an issue with password");

	}

	public static void generatealerts(WebDriver driver,String message) {
		JavascriptExecutor Js = (JavascriptExecutor) driver;
		
		Js.executeScript("window.scrollBy(0,5000)", "");
		Js.executeScript("alert('"+message+"')");
	}
}
