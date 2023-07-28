package selenum_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act = new Actions(driver);
		
		WebElement double1=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		
		act.doubleClick(double1).build().perform();
		
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		WebElement right = driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
		
		act.contextClick(right).build().perform();
		
		Boolean paste=driver.findElement(By.xpath("//span[text()=\"Paste\"]")).isDisplayed();
		System.out.println(paste);
		
		
		
		}

}
