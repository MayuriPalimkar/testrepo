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

public class Screenshot4 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(4000);
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(4000);
		String Random = RandomString.make(5);
		String Imagename = "Facebook";
		
		File dest = new File ("C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\src\\Screenshot\\Screenshots"+Imagename+" "+Random+".jpg");
		
		FileHandler.copy(source,dest);
		
		driver.close();
		
	}

}
