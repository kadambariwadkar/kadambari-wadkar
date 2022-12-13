package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clickMethodStudy {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/mantra");
	driver.manage().window().maximize();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//a[text()='Men'])[1]")).click();
	
	}

}
