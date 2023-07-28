package Com.Ecommerce.Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class GenericUtils extends Ecommerce_BaseClass {
	
	public static String getscreenshotAs(String TestcaseName, WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		String TimeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format (new Date());
		
		String Name = "-Screenshot-"+ TimeStamp;
		
		Path resourcedirectory = Paths.get("src","test","resources");
		String absolutepath=resourcedirectory.toFile().getAbsolutePath();
		
		System.out.println(absolutepath);
		
		String destination = absolutepath+"//Screenshot//"+TimeStamp+""+Name+".png";
		
		FileUtils.copyFile(Source, new File (destination));
		
		return destination;
	}	
		
		
	
	public static void clickElementsusingjavaScript(WebElement element , WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
		}
	
	public static WebElement WaitForElement(WebDriver driver, By Locator,int Timeout) {
		WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(Timeout));
		
		myWait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		return driver.findElement(Locator);
	}
}
