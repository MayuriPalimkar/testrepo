package selenum_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();  //to maximize the webpage /browser
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Thread.sleep(4000);
		String name = "Facebookpractice";
		
		String Random = RandomString.make(4);
		
		
		File dest =new File("C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\screenshots111"+name+Random+".jpg");
		
		FileHandler.copy(source, dest);
		Thread.sleep(4000);
		driver.quit();
		
		

	}

}
