package Byjus_pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class test_class {

	@Test
	public  void demo() throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 
		//create the object
		base_class bc = new base_class(driver);
		
		bc.Go_To();
		Thread.sleep(2000);
		
		bc.session();
		
		bc.MyName();
		
		bc.number();
		
		bc.send_otp1();
		Thread.sleep(2000);
		//bc.otp_click();
		//Thread.sleep(5000);
		bc.city1();
		
		bc. center1();
		
		bc.grade();
		
		bc.submit();
		
		driver.quit();
		
		
	}

}
