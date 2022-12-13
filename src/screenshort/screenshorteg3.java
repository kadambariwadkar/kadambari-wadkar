package screenshort;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshorteg3 {

	public static void main(String[] args) throws InterruptedException, IOException
{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(100);
	   File path = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   System.out.println("path is"+path);
	   File screen = new File("E:\\Screenshort\\google.png");
	   FileHandler.copy(path, screen);
	}

}
