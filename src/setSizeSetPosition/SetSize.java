package setSizeSetPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(1000);
	//how to get size
	Dimension defaultsize = driver.manage().window().getSize();
	System.out.println(defaultsize);
	//to set the size, we need to create object of Dimension class and pass width and height value;
	Dimension d =new Dimension(1300,352);
	//by using dimension object set the size using setSizeMethod
	Thread.sleep(1000);
		driver.manage().window().setSize(d);
		Dimension d1=new Dimension(500,1000);
		Thread.sleep(1000);
		driver.manage().window().setSize(d1);
		System.out.println(defaultsize);
		
	
	

	
	}

}
