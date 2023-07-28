package com.openMRS.baseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.openMRS.Utilities.ReadConfiguration;

public class baaseclass2 {
	
	public static WebDriver driver;
	public static Logger logger; // for logging info purpose

	ReadConfiguration Rc = new ReadConfiguration();  //it will invoke the default constructor
	
	public String BaseURL= Rc.getApplicationURL();
	public String Username = Rc.getUsername();
	public String Password = Rc.getPassword();
	public String Chromepath = Rc.getchromepath();
	public String geckopath = Rc.getgeckopath();
	
	@Parameters("browser")
	@BeforeClass
	public void SetUp(String br) {

		logger = logger.getLogger("Maven_practice1");
		PropertyConfigurator
				.configure("C:\\Users\\Mayuri\\eclipse-workspace\\Maven_practice1\\Configuration\\log4j.properties");

		logger.info("Maven_practice1");
		if(br.equalsIgnoreCase("chrome")) {
		System.setProperty("Webdriver.Chrome.driver",Rc.getchromepath());
		driver = new ChromeDriver();
		logger.info("open browser");
		}
		else if(br.equalsIgnoreCase("Firefox")) {
			System.setProperty("Webdriver.gecko.driver", "geckopath");
			driver = new FirefoxDriver();
			logger.info("open browser");
		}
		driver.manage().window().maximize();
		logger.info("maximize the browser");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.get(BaseURL);
		logger.info("open Apllication");
	}

	@AfterClass
	public void TearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

	

}
