package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class zerodha1 {
	

	public static void main(String [] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String Imagename = "Zerodha";
		
		File dest = new File ("C:\\Users\\Mayuri\\Desktop\\Screenshots\\zerodha.jpg");
		Thread.sleep(2000);
		FileHandler.copy(source, dest);
		
		Thread.sleep(5000);
		driver.close();
		
		
}
}