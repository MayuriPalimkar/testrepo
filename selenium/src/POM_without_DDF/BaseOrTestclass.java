package POM_without_DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseOrTestclass {

	public static void main(String[] args) {
	
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		login_page LP = new login_page(driver) ;
		LP.GoTo();
		LP.Usermail("Admin");
		LP.password1("admin123");
		LP.login();
		
		Dashboard_page DP = new Dashboard_page(driver);
		DP.NameValidation();
		DP.TimeAt();
		
		
		driver.quit();
		
			
		

	}

}
