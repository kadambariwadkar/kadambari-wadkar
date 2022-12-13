package iframe;

//import org.apache.batik.ext.awt.image.spi.JDKRegistryEntry.MyImgObs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(1000);
		 String mytext = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class')]")).getText();
	System.out.println(mytext);
	driver.switchTo().defaultContent();
	String mytext1 = driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate')]")).getText();
	System.out.println("main page text  "+mytext1);
	}
	}
