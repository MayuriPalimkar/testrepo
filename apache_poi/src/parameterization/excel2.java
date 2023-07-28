package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel2 {
	public static void main(String[] args) throws  EncryptedDocumentException,IOException {
		String path ="E:\\New folder\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		String data = workbook.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
