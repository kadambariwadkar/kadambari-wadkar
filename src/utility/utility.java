package utility;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class utility
{
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		  File myFile = new File("E:\\Selenium\\chromedriver folder\\myexcel.xlsx");
		String value = WorkbookFactory.create(myFile).getSheet("sheet3").getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("reding data from excel", true);
		return value;
	}
	public static void screenshot(WebDriver driver,String screenShotName) throws IOException
	{
		wait(driver,500);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\\\Screenshort\\w3school.png");
FileHandler.copy(src, dest);
Reporter.log("taking screenshot",true);
		
		
	}
	public static void scrollintoView(WebDriver driver,WebElement element)
	{
		wait(driver,500);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollintoView(true)",element);
		Reporter.log("Scrolling into view",true);
		
	}
	public static void wait(WebDriver driver, int waitTime) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		Reporter.log("waiting for"+waitTime+"ms",true);
	}
	
}
