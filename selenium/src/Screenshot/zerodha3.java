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

import net.bytebuddy.utility.RandomString;

public class zerodha3 {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
		String File = "zerodha";
		
		zerodha3.tss("1"+File);
		zerodha3.tss("2"+File);
		zerodha3.tss("3"+File);	
		
		Thread.sleep(5000);
		driver.close();
	
}
	public static void tss(String filename) throws IOException, InterruptedException {
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(5000);
		
		String Random = RandomString.make(7);
		
		File dest = new File("C:\\Users\\Mayuri\\eclipse-workspace\\11thmarch\\zerodha_screenshot\\"+filename+Random+".jpg");
		
		
		FileHandler.copy(source, dest);
		Thread.sleep(3000);
		
	}
	
}