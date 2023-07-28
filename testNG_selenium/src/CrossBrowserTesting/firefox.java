package CrossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\geckodriver.exe");
	WebDriver	driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
			
	}

}
