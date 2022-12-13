package popup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupeg1 {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriverfolder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
//		driver.findElement(By.id("alertButton")).click();
		
	}

}
