package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement account=driver.findElement(By.xpath("//span[contains(text(),\"Account & Lists\")]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(account).build().perform();
		
		driver.findElement(By.xpath("//span[@class=\"nav-action-inner\"]")).click();
		
		//driver.findElement(By.xpath("//label[@class=\"a-form-label\"]")).sendKeys("mayuri@gmail.com");
		driver.findElement(By.id("createAccountSubmit")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ap_customer_name")).sendKeys("Mayuri");
	//	driver.findElement(By.id("continue")).click();
		
		
		driver.findElement(By.id("ap_phone_number")).sendKeys("9890173561");
		driver.findElement(By.id("ap_password")).sendKeys("9890173561");
		driver.findElement(By.id("continue")).click();
		driver.quit();
		
		
	}

}
