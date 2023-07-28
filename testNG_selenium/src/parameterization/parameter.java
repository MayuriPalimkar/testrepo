package parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parameter {

	WebDriver driver;
	@Parameters({"URL"})
	@BeforeMethod
	public void setup(String URL) {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("URL");
	}
	@Parameters({"username"})
	@Test
	public void test(String username) {
		WebElement name =driver.findElement(By.id("email"));
		name.sendKeys("username");
		System.out.println("username");
	}
	
	@Parameters({"passsword"})
	@Test
	public void test2(String password) {
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("password");
		System.out.println("password");
	}
	
	@Test
	public void button() {
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	}
	
	public void Teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}
