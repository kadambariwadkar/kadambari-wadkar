package crossBrowserTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class c1 {

	public static void main(String[] args) {
		
		 
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		 
		 
		 driver.get("https://paytm.com/");
		 driver.manage().window().maximize();
	}

}
