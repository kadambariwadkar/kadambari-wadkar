package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		 File myFile = new File("E:\\Selenium\\chromedriver folder\\myexcel.xlsx");
		Workbook value1 = WorkbookFactory.create(myFile);
		Sheet mysheet = value1.getSheet("sheet1");
		Row myrow = mysheet.getRow(0);
		Cell mycell = myrow.getCell(0);
		CellType mycelltype = mycell.getCellType();//give you type
		System.out.println(mycelltype);
		String value = mycell.getStringCellValue();//give value
		System.out.println(value);

	}

}
