package selenum_practice;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class parameterization {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Mayuri\\eclipse-workspace\\apache_poi\\Excel_sheets\\Data.xlsx");
		

	//	String data=WorkbookFactory.create(file).getRow().getCell().getStringCellValue();
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int Row = sheet.getLastRowNum();
		
		System.out.println(Row);
		
		int col = sheet.getRow(1).getLastCellNum();
		System.out.println(col);
		
		//to read all data 
		for(int i=0; i<Row;i++) {
			XSSFRow Row1= sheet.getRow(i);
			
			for(int j=0; j<col; j++) {
				//XSSFCell cell = sheet.getRow(i).getCell(j);
				XSSFCell cell = Row1.getCell(j);
				
				switch(cell.getCellType()) {
				case STRING :
					System.out.println(cell.getStringCellValue());
				break;
				case NUMERIC :
					System.out.println(cell.getNumericCellValue());
					break;
				case BOOLEAN :
					System.out.println(cell.getBooleanCellValue());
					
					
				
				}
				System.out.println("||");
			}
			System.out.println();
		}
		
	}

}
