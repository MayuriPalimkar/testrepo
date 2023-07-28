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

public class instagram {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
	    File source=	((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(6000);
        String Imagename = "Instagram";
        String Random = RandomString.make(4);
        
        File dest = new File("C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\screenshots111"+Imagename+Random+".jpg");
        Thread.sleep(8000);
        FileHandler.copy(source, dest);
       
        driver.close();
        
	}

}
