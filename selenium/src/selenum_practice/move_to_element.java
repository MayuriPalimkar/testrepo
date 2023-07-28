package selenum_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class move_to_element {

	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement account=driver.findElement(By.xpath("//span[@class=\"nav-line-2 \"]"));
		
		Actions act = new Actions(driver);
		
		//act.moveToElement(account).build().perform();
		Action action = (Action) act.moveToElement(account);
		action.perform();
		
		driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]")).click();
		
		

	}

}
