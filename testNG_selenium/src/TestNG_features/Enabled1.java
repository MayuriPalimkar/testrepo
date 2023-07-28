package TestNG_features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Enabled1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test
	public void B() {
		boolean logo =driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo);
		System.out.println("B");
	}
	@Test(enabled = false)
	public void A() {
		boolean logo =driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		System.out.println(logo);
		System.out.println("B");
	}
	
	@Test(enabled = false)
	public void test1() {
		System.out.println("Test 1");
	}
	
	
	@Test(enabled = true)
	public void test2() {
		System.out.println("Test 2");
	}

	
	@Test(enabled = true)
	public void test3() {
		System.out.println("Test 3");
	}
	
	@AfterClass
	public void TearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
