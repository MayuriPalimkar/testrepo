package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//port org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShot {
	
		public static void main(String [] args) throws InterruptedException, IOException {
			System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			File Destination = new File("C:\\Users\\Mayuri\\Desktop\\Screenshots/sample.jpg");
			FileHandler.copy(source, Destination);
			driver.quit();
	}

}
