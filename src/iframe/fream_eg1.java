package iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fream_eg1 {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","E://Selenium//chromedriver.exe");
		 
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println(driver.getTitle());
		
	}

}
