package excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class holrowandcell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		  File myFile = new File("E:\\Selenium\\chromedriver folder\\myexcel.xlsx");
		  Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		  System.out.println("=================================================");
		  for(int i=0;i<=3;i++)
		  {
			  String value1 = mysheet.getRow(3).getCell(i).getStringCellValue();
			  System.out.print(value1+" ");
			  }
		  System.out.println();
		  System.out.println("============================================");
		  //how to read whole column/cell from excel
		  for(int i=0;i<=3;i++)
		  {
		  String value2 = mysheet.getRow(i).getCell(0).getStringCellValue();
		  System.out.println(value2);
		  }
		  System.out.println("============================================");
	}

}
