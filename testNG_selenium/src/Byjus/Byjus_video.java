package Byjus;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Byjus_video {

	WebDriver driver;
	
	@BeforeMethod
    public void setup() throws InterruptedException {
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN");
	Thread.sleep(3000);
}


 @Test
 public void Test() throws InterruptedException {
	 JavascriptExecutor JS = (JavascriptExecutor) driver;
	 
	WebElement element= driver.findElement(By.xpath("//h2[normalize-space()='Watch video lessons']"));
	
	JS.executeScript("arguments[0].scrollIntoView();",element);
	
	Thread.sleep(4000);
	
	WebElement listbox=driver.findElement(By.xpath("//select[@class='form-control video-selection']"));
	Select s1 = new Select(listbox);
	s1.selectByVisibleText("Class 10");
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//div[@class='row row-inline']//div[1]//a[1]")).click();
	Thread.sleep(3000);
	
 }
 
 @AfterMethod
 public void TearDown() {
	 System.out.println("Execution completed");
	 
	 driver.quit();
 }
}
