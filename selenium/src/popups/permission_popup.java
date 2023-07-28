package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class permission_popup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource" );
		WebDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();

		driver.get("https://www.hdfcbank.com/");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
