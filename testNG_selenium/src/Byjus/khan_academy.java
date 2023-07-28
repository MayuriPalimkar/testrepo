package Byjus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class khan_academy {

	WebDriver driver;
	   @BeforeMethod
	   public void setup() throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
	       driver = new ChromeDriver();
	      
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      driver.get("https://www.khanacademy.org/");
	      
	      driver.findElement(By.xpath("//a[@id=\"login-or-signup\"]")).click();
	   }
	       
	      @Test
	      public void test1() throws InterruptedException {
	    	  
	      

	     WebElement element = driver.findElement(By.xpath("//button[@role='button']"));
	     
	     JavascriptExecutor Js = (JavascriptExecutor) driver;
	     Js.executeScript("arguments[0].scrollIntoView()", element);
	     
	     driver.findElement(By.xpath("//input[@id='uid-login-form-0-wb-id-identifier-field']")).sendKeys("palimkarmayuri153@gmail.com");
	     driver.findElement(By.xpath("//input[@id='uid-labeled-text-field-1-wb-id-field']")).sendKeys("mayuri153");
	     driver.findElement(By.xpath("//button[@role='button']")).click();
	     
	     Thread.sleep(4000);
	     
	     
	}
	   @Test
	   public void test() throws InterruptedException {
		  boolean logo= driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'#14bf96')]")).isDisplayed();
		  System.out.println(logo);
		  Thread.sleep(4000);
		  
	   }
	   
	   @AfterMethod
	   public void Tear_down() throws InterruptedException {
		   driver.findElement(By.xpath("//span[@class='_wozql4 _13hnk7qk']")).click();
		   driver.findElement(By.xpath("//span[normalize-space()='Log out']")).click();
		   
		   Thread.sleep(4000);
		   driver.quit();
	   }

}
