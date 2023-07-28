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

public class w3school2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/");
		Thread.sleep(7000);
		
	    WebElement code=	driver.findElement(By.xpath("//h1[text()=\"Learn to Code\"]"));
	    
	  File source = (( TakesScreenshot)code).getScreenshotAs(OutputType.FILE);
	  Thread.sleep(5000);
	  File dest = new File("C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\screenshots111\\code.jpg");
	  
	  FileHandler.copy(source,dest);
	  
	  driver.close();
	  

}
}