package setSizeSetPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(1000);
	// getting default position
	Point defualtPosition = driver.manage().window().getPosition();
	System.out.println(defualtPosition);
	//to set the position, we need to create object of point class and pass x and y values
	Point p= new Point(57, 10);
	//using point class object use method setPosition
	Thread.sleep(1000);
	driver.manage().window().setPosition(p);
	
	}

}
