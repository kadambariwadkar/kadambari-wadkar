package neoStoxBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
public class Base {
	protected WebDriver driver;
	public void launchBrowser() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://neostox.com/");
	Reporter.log("Launching browser", true);
	Thread.sleep(1000);
	}
}
