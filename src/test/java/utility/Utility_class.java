package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {
	
	public static String getTD(int rowindex,int colindex) throws Throwable  {
		
	//create object of fileinput stream class
	FileInputStream fis= new FileInputStream("C:\\Users\\Roshanali\\Documents\\Roshnali Douments\\Framework.xlsx");

	//open excelsheet
	Sheet sh = WorkbookFactory.create(fis).getSheet("sheet1");
	String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
	return data;
	
}
}