package notification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class blockNotification {

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeOptions options=new ChromeOptions();

		options.addArguments("--disable-notifications");
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.justdial.com/");

		Thread.sleep(500);

	}

}
