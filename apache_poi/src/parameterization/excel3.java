package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
      String Path = "C:\\Users\\Mayuri\\Downloads\\New folder\\Data.xlsx";
		
		FileInputStream file= new FileInputStream(Path);

	 //  XSSFWorkbook workbook = new XSSFWorkbook(file);
	 // String data1= workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
	//	System.out.println(data1);
		
		String Data = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
	    System.out.println(Data);

	}

}
