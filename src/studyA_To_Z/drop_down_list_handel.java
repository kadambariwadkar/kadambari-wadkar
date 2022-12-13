package studyA_To_Z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down_list_handel {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement dropdownlist = driver.findElement(By.xpath(" //select[@id='dropdown-class-example']"));
         Select s = new Select(dropdownlist);
         s.selectByVisibleText("Option1");
         Thread.sleep(100);
         s.selectByValue("option2");
         Thread.sleep(100);
         s.selectByIndex(3);
         
       
         
         
	}

}
