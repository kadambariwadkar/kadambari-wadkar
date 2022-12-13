package TestNGbyusingPOM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class ValidateUpstoxUserId {
 
WebDriver driver;
Sheet mySheet;
File myFile;
UpstoxLoginPageTESTNG login;
UpstoxPasscodePageTESTNG passcode;
UpStoxWelcomePageTESTNG welcome;
UpstoxHomePageTESTNG home;
@BeforeClass
public void launchBrowser() throws InterruptedException, EncryptedDocumentException, 
IOException
{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://login-v2.upstox.com/");
Reporter.log("launching browser",true);
Thread.sleep(1000);
login= new UpstoxLoginPageTESTNG(driver);
passcode= new UpstoxPasscodePageTESTNG(driver);
welcome= new UpStoxWelcomePageTESTNG(driver);
home= new UpstoxHomePageTESTNG(driver);
myFile= new File("E:\\Selenium\\chromedriver folder\\myexcel.xlsx");
mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
}
@BeforeMethod
public void loginToUpstox()
{
login.enterUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
login.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
login.clickOnSignInButton();
Reporter.log("sending userName, password and clicking on signin button..",true);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
passcode.sendPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
Reporter.log("sending passcode...",true);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
welcome.clickOnNoIamGoodButton();
Reporter.log("Clicking on No I am good button", true);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
}
@Test
 public void validateUserID() throws IOException, InterruptedException 
 {
 String expectedUserID = mySheet.getRow(0).getCell(3).getStringCellValue();
 String actualUserID = home.getActualUserID(driver);
 Assert.assertEquals(actualUserID, expectedUserID,"TC is failed actual and expected are not matching");
 Reporter.log("Validating userID and taking screenshot",true);
 }
@AfterMethod
public void logOutFromUpstox() throws InterruptedException
{
home.logout();
Reporter.log("logging out from application..",true);
}
@AfterClass
public void closeBrowser()
{
Reporter.log("closing browser..",true);
driver.close();
}
}