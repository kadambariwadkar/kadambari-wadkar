package listboxstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Liststudy1 {

	public static void main(String[] args) throws InterruptedException
	{
	
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		//step1: decide list box to handle and store in ref variable
		Thread.sleep(1000);
		WebElement Day = driver.findElement(By.id("day"));//step1
		
		//step2: create an object of select class and pass ref-element
		Select s= new Select(Day);//step2 Day passed in Select
		
		Thread.sleep(1000);
		
		//step3:use select object and call any of three methods as per need
		s.selectByValue("10");//step3: value 10 is passed
	
	 List<WebElement> DayOptions = s.getOptions();
	System.out.println(DayOptions.size());
		s.selectByValue("10");

		
	}

}
