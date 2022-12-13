package web_Tab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtableeg1 {

	public static void main(String[] args) 
	{
       System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		 List<WebElement> totalrows = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		 System.out.println("total rows are "+totalrows.size());
		 List<WebElement> totalcom = driver.findElements(By.xpath("//table[@id='product']//tr//th"));
		 System.out.println("total coulmn  "+totalcom.size());
		 
		 
		 
	}

}
