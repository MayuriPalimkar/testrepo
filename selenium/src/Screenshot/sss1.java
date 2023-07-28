package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class sss1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.intl=in");
        Thread.sleep(5000);
        
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(4000);
		
		File dest = new File("C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\screenshots111\\yahoo.jpg");
		Thread.sleep(2000);
		FileHandler.copy(source, dest);
		driver.quit();
	}

}
