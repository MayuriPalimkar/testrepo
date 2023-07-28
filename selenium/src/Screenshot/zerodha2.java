package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class zerodha2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//h2[text()=\"Login to Kite\"]"));
		
		
	    File source = ((TakesScreenshot)login).getScreenshotAs(OutputType.FILE);
	
	    Thread.sleep(3000);
	     String Random = RandomString.make(7);
	     String name = "zerodhalogo";
	     
	     File dest = new File("C:\\Users\\Mayuri\\eclipse-workspace\\11thmarch\\zerodha_screenshot\\"+name+Random+".jpg");
	     
	     FileHandler.copy(source, dest);
	     Thread.sleep(3000);
	     driver.quit();
		
		
	}

	
	
}
