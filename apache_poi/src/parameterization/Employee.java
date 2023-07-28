package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "C:\\Users\\Mayuri\\eclipse-workspace\\apache_poi\\Excel_sheets\\Employee.xlsx.xlsx";
		
		FileInputStream File = new FileInputStream (path);
		
		double value =WorkbookFactory.create(File).getSheetAt(0).getRow(3).getCell(2).getNumericCellValue();
        
		System.out.println("salary of HR ="+value);
		
		XSSFWorkbook workbook = new XSSFWorkbook(path);
		
		String value1=workbook.getSheet("Sheet1").getRow(4).getCell(4).getStringCellValue();
		
		System.out.println("last Row and Cell value is ="+value1);
		
	
			}
			
		}


