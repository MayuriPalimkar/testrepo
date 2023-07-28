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

public class Screenshot8 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(4000);
		
		String file = "Redbus";
		
		Screenshot8.Takess(file);
		Screenshot8.Takess("Test"+file);
		
		
		
		Thread.sleep(4000);
		driver.close();
	}
	
	public static void Takess(String filename) throws IOException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String Random = RandomString.make(4);
		
		File dest = new File("C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\screenshots111\\"+filename+Random+" .jpg");
		
		FileHandler.copy(source, dest);
	}

}
