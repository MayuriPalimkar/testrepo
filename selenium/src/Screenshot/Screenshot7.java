package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.bytebuddy.utility.RandomString;

public class Screenshot7 {
	static WebDriver driver;
	public static void main(String [] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(4000);
		
		String file = "Facebook";
		
		Screenshot7.Takesscreenshot(file);
		
		driver.quit();
	}
	
	public static void Takesscreenshot(String Filename) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String Random = RandomString.make(4);
		
		File dest = new File("C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\screenshots111\\"+Filename+Random+".jpg");
		
		FileHandler.copy(source, dest);
	}
	

}
