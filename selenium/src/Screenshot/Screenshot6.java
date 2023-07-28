package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot6 {
	public static void main(String [] args) throws InterruptedException, IOException {
	System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/");
	
	Thread.sleep(3000);
	
	WebElement facebooklogo = driver.findElement(By.xpath("//img[@class=\"_97vu img\"]"));
	Thread.sleep(3000);
	File source = ((TakesScreenshot)facebooklogo).getScreenshotAs(OutputType.FILE);
	Thread.sleep(5000);
	String Random = RandomString.make(3);
	
	String Imagename = "Facebook";
	
	File dest = new File ("C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\screenshots111\\"+Imagename+" "+Random+".jpg");
	
	FileHandler.copy(source,dest);
	
	driver.close();

}
}