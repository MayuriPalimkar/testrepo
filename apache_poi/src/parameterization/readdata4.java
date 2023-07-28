package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdata4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream File = new FileInputStream("C:\\Users\\Mayuri\\eclipse-workspace\\apache_poi\\Excel_sheets\\11March_Data.xlsx");
		
        String data=  WorkbookFactory.create(File).getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
        
        System.out.println(data);
        
        
        FileInputStream file1 = new FileInputStream("C:\\Users\\Mayuri\\eclipse-workspace\\apache_poi\\Excel_sheets\\StudentInfo.xlsx");
        
       String data1= WorkbookFactory.create(file1).getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
        
        System.out.println(data1);
        
        System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        driver.findElement(By.id("email")).sendKeys(data);
        
        driver.findElement(By.id("pass")).sendKeys(data1);
        
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
        
        Thread.sleep(4000);
        driver.close();
        
        
        
        
        
	}

}
