package practiceneostox;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Thread.sleep(1000);
		File excelfile = new File ("E:\\MyExcel.xlsx");
		Sheet excelsheet = WorkbookFactory.create(excelfile).getSheet("sheet1");
		//String mono = excelsheet.getRow(0).getCell(0).getStringCellValue();
		WebElement mobileno = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$signinsignup$txt_mobilenumber']"));
		mobileno.sendKeys(excelsheet.getRow(0).getCell(0).getStringCellValue());
		//mobileno.sendKeys(mono);
		driver.findElement(By.xpath("(//a[text()='Sign Up'])[2]")).click();
		//String pass = excelsheet.getRow(0).getCell(1).getStringCellValue();
		WebElement password = driver.findElement(By.name("ctl00$MainContent$_wp_enteraccesspin$txt_accesspin"));
		//password.sendKeys(pass);
		
		password.sendKeys(excelsheet.getRow(0).getCell(1).getStringCellValue());
		driver.findElement(By.id("lnk_submitaccesspin")).click();

		
		
		
		
	}

}
