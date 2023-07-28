package Framewors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRM_withoutDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("Wedriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String path = "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\orangeHRM\\orange_hrm.xlsx";
		
		FileInputStream File = new FileInputStream(path);
		
		String name=WorkbookFactory.create(File).getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(name);
		
		FileInputStream File1 = new FileInputStream(path);
		
	    String password = WorkbookFactory.create(File1).getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
	  
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
	  
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	    String text = "Paul Collings";
	    
	   String actualtext= driver.findElement(By.xpath("//p[@class=\"oxd-userdropdown-name\"]")).getText();
	   
	    if(text.equals(actualtext)) {
	    	System.out.println("Login Successful");
	    }
	    else {
	    	System.out.println("Incorrect username or password");
	    }
	}

}
