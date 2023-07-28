package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdata1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//to fetch string data from excel sheet
		FileInputStream file = new FileInputStream("C:\\Users\\Mayuri\\Downloads\\New folder\\Data.xlsx");

		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		FileInputStream file1 = new FileInputStream("C:\\Users\\Mayuri\\Downloads\\New folder\\Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file1);
		
		String data1 = workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		System.out.print(" "+data1);
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\Mayuri\\eclipse-workspace\\selenium\\resource");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(data);
		
		driver.findElement(By.id("pass")).sendKeys(data1);
		
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
