package Com.Ecommerce.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Com.Ecommerce.Configuration.facebook_readconfig;


public class facebook_baseclass {

	public static WebDriver driver;
	public static Logger logger;
	
	facebook_readconfig frc = new facebook_readconfig();
	
	public String BaseURL = frc.getapplicationURL();
	public String Username = frc.Username();
	public String Password = frc.pass();
	public String chromepath = frc.getChromePath();
	
	@BeforeMethod
	public void initialization() {
		System.setProperty("Webdriver.Chrome.driver","chromepath");
		logger= logger.getLogger("maven_framework");
		
		PropertyConfigurator.configure("C:\\Users\\Mayuri\\eclipse-workspace\\maven_framework\\Configuration\\log4j.properties");
		driver = new ChromeDriver();
		logger.info("Open Browser");
		
		driver.manage().window().maximize();
		logger.info("Maximize the browser");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get(BaseURL);
		logger.info("open application");
		
	}
	
	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	
	

	
}


