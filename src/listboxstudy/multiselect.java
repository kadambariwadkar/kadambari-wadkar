package listboxstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselect {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement MultiSelectDropDown= driver.findElement(By.id("cars"));
		Select s= new Select(MultiSelectDropDown);
		//3.
		System.out.println("Multiple selectable status is "+s.isMultiple());
		Thread.sleep(1000);
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		s.selectByValue("audi");
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);

		
	}

}
