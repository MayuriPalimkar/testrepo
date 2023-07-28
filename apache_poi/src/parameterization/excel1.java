package parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel1 {

	public static void main(String[] args) throws IOException     {
		
	File file = new File("C:\\Users\\Mayuri\\Downloads\\Book1.xls");
		
		FileInputStream file1 = new FileInputStream(file);
		
		//String data1 = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

	// System.out.println(data1);
		XSSFWorkbook workbook = new XSSFWorkbook(file1);
		XSSFSheet sheet =workbook. getSheetAt(0);
		String cellvalue=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellvalue);
		workbook.close();
		file1.close();
	}

	
}
