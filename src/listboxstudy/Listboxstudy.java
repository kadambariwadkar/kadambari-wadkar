package listboxstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listboxstudy {

	public static void main(String[] args) throws InterruptedException 
	{
//System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		//driver.navigate().to("https://en-gb.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(100);
		WebElement Day = driver.findElement(By.id("day"));//
		Select s = new Select(Day);
		Thread.sleep(1000);
		s.selectByValue("15");
		 List<WebElement> DayOptions = s.getOptions();
		System.out.println(DayOptions.size());
			s.selectByValue("15");
			
			
			
			
	}

}
