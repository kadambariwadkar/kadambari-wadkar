package neoStoxBase;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import neoStoxUtility.UtilItyNew;
public class BaseNew {
	protected WebDriver driver;
	public void launchBrowser() throws InterruptedException, IOException
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(UtilItyNew.readDataFrompropertyFile("url"));
	Reporter.log("Launching browser", true);
	Thread.sleep(1000);

}
}