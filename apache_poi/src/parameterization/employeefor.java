package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class employeefor {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\Mayuri\\eclipse-workspace\\apache_poi\\Excel_sheets\\employee.xlsx";
		
		FileInputStream file = new FileInputStream(path);

		XSSFWorkbook work = new XSSFWorkbook(file);
		
		XSSFSheet sheet = work.getSheetAt(0);
		
		int Rows = sheet.getLastRowNum();
		//System.out.print(" "+Rows);
		
		int cols = sheet.getRow(1).getLastCellNum();
		//System.out.print(" "+cols);
		
		
		for (int R=0; R<Rows;R++ ) {
			XSSFRow row = sheet.getRow(R);
			//System.out.print(" "+row);
			for(int c=0; c<cols; c++) {
			String  col = row.getCell(c).toString();
				System.out.print("                "+col);
			}
			System.out.println();
		}
		
		
	}

}
