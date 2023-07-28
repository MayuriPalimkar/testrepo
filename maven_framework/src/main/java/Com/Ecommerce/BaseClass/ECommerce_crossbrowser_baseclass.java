package Com.Ecommerce.BaseClass;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Ecommerce.Configuration.ReadCofiguration;

public class ECommerce_crossbrowser_baseclass {
	
	public static WebDriver driver;
	public static Logger logger;
	
	ReadCofiguration RC = new ReadCofiguration();
	
	public String BaseURL = RC.getApplicationURL();
	public String Username = RC.Username();
	public String Password = RC.password();
	public String Chromepath = RC.getChromePath();

	public void initialization() {
		
		
		logger = logger.getLogger("maven_framework");
		PropertyConfigurator.configure("C:\\Users\\Mayuri\\eclipse-workspace\\maven_framework\\Configuration\\log4j.properties");
		
		driver= new ChromeDriver();
		logger.info("open browser");
		
		
		
	}

}
