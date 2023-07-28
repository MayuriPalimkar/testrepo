package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenshot3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\src\\Screenshot\\Screenshots\\sample1.jpg");
		
		FileHandler.copy(source, dest);
		driver.close();
		
	}

}
