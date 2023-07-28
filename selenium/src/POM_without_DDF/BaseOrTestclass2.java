package POM_without_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseOrTestclass2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
   System.setProperty("Webdriver.Chrome.driver","C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		login_page LP = new login_page(driver);
		//to fetch data from excel sheet
		
		String path = "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\orangeHRM\\testData_DDF.xlsx";
		FileInputStream File = new FileInputStream (path);
		
		Sheet data=WorkbookFactory.create(File).getSheet("Sheet1");
		LP.GoTo();
		String UserId = data.getRow(1).getCell(0).getStringCellValue();
        LP.Usermail(UserId);
		
        String password = data.getRow(1).getCell(1).getStringCellValue();
        LP.password1(password);
        LP.login();
        
        Dashboard_page DP = new Dashboard_page(driver);
        DP.NameValidation();
        DP.TimeAt();
        
        driver.quit();
        
	}

}
