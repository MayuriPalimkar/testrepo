package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readdata2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// to fetch string data from excel sheet
		
		FileInputStream file = new FileInputStream("C:\\Users\\Mayuri\\Downloads\\New folder\\Data.xlsx");
		
	String data =	WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	System.out.println(data);
	
	FileInputStream file1 = new FileInputStream("C:\\Users\\Mayuri\\Downloads\\New folder\\Data.xlsx");
	
	String data1 =WorkbookFactory.create(file1).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		FileInputStream file2 = new FileInputStream("C:\\Users\\Mayuri\\Downloads\\New folder\\Data.xlsx");
	String data2 =	WorkbookFactory.create(file2).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data2);
		
		
		FileInputStream file3 = new FileInputStream("C:\\Users\\Mayuri\\Downloads\\New folder\\Data.xlsx");
		
	double data3=	WorkbookFactory.create(file3).getSheet("Sheet2").getRow(10).getCell(0).getNumericCellValue();
		System.out.println(data3);
	}

}
