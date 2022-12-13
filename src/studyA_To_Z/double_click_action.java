package studyA_To_Z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click_action {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions act=new Actions(driver);
		WebElement doubleClikButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	  /*act.moveToElement(doubleClikButton).perform();
	  act.doubleClick().perform();*/
		act.moveToElement(doubleClikButton).doubleClick().build().perform();
		
	
	}
	

}
