package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class axcel_reding_eg {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		  File myFile = new File("E:\\Selenium\\chromedriver folder\\myexcel.xlsx");
		  String value1 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
			System.out.println(value1);
		  //String val2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	//System.out.println(value1);
	//System.out.println(val2);
	}

}
