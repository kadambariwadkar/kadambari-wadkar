package screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshorteg2 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_EAIaIQobChMIyc756c36-gIVMJNmAh1o_QRKEAAYASAAEgJpHvD_BwE_k_&gclid=EAIaIQobChMIyc756c36-gIVMJNmAh1o_QRKEAAYASAAEgJpHvD_BwE");
	  Thread.sleep(100);
		File path = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  // System.out.println("path is"+path);
	   File screen = new File("E:\\Screenshort\\amazon1.png");
	   FileHandler.copy(path, screen);
	   
	    
	}
	

}
