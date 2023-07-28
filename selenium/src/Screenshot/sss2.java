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

public class sss2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(5000);
		
		File source= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(5000);
		String name = "demoQa";
		String Random = RandomString.make(7);
		Thread.sleep(5000);
		File dest=new File("C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\screenshots111"+name+Random+".jpg");
		
		FileHandler.copy(source, dest);
		
		Thread.sleep(4000);
		driver.close();
	}

}
