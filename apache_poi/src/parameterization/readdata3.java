package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdata3 {

	public static void main(String[] args) throws IOException {
		

		String file= "C:\\Users\\Mayuri\\eclipse-workspace\\apache_poi\\Excel_sheets\\11March_Data.xlsx";
		FileInputStream file1 = new FileInputStream(file);
		
		XSSFWorkbook work = new XSSFWorkbook(file1);
		XSSFSheet sheet = work.getSheetAt(2);
		int Rows = sheet.getLastRowNum();
		System.out.println("Rows");
		
		int cols = sheet.getRow(1).getLastCellNum();
		System.out.println(cols);
		
		for (int R=0;R<=Rows; R++) {
			XSSFRow row = sheet.getRow(R);
			for (int c=0; c< cols;c++) {
				XSSFCell cell = row.getCell(c);
				switch (cell.getCellType()) {
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					System.out.println(cell.getBooleanCellValue());
					break;
				}
				System.out.print(" || ");
				}
			System.out.println();
			}
		}
		
	}


