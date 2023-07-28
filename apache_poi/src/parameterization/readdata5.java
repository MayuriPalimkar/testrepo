package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdata5 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login.yahoo.com/?.intl=in");
        Thread.sleep(0);
        
        FileInputStream file = new FileInputStream("C:\\Users\\Mayuri\\eclipse-workspace\\apache_poi\\Excel_sheets\\Data.xlsx");
        
        String data=   WorkbookFactory.create(file).getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
        
        driver.findElement(By.id("login-username")).sendKeys(data);
        Thread.sleep(4000);
        driver.findElement(By.id("createacc")).click();
        
        Thread.sleep(5000);
        driver.quit();
	}

}
