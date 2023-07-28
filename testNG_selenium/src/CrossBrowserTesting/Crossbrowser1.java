package CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser1 {

	WebDriver driver;
	@Parameters("Browsername")
	@Test
	public void browsername(String browsername) {
		
		if(browsername.equalsIgnoreCase("Chrome")) {
			System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
			driver = new ChromeDriver();
			
		}
		else if (browsername.equalsIgnoreCase("FireFox")){
			System.setProperty("Webdriver.gecko.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\geckodriver.exe");
		driver = new FirefoxDriver();
			
		}

		/*System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		driver = new ChromeDriver();*/
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username =driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		/*String exp_name = "Paul Collings";
		WebElement act_name = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		
		Assert.assertEquals(exp_name, act_name);
		
		System.out.println("correct username");*/
		boolean Test = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed();
		Assert.assertTrue(Test);
		System.out.println("Execution completed");
	    driver.quit();
	
	}
	
}
