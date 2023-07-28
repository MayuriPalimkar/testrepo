package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot2 {
	public static void main(String [] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
   		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
}
}