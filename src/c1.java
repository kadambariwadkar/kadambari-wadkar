import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class c1 {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "D:\\New folder\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=  new FirefoxDriver();
		driver.get("https://demoqa.com/alerts");
	}}
