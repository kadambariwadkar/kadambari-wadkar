package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		Point defultposition = driver.manage().window().getPosition();
		System.out.println(defultposition);
		Point p = new Point(57, 10);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100000));
		driver.manage().window().setPosition(p);
	}

}
