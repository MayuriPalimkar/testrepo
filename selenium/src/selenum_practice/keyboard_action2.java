package selenum_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_action2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(2000);
		
		act.sendKeys(Keys.SHIFT).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(2000);
		
		act.sendKeys(Keys.CONTROL).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(2000);
		
		act.sendKeys(Keys.DELETE).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(2000);
		
		act.sendKeys(Keys.BACK_SPACE).build().perform();
		System.out.println(driver.findElement(By.id("result")).getText());
		Thread.sleep(2000);
		
		
	}

}
