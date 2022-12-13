package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void print1() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zerodha.com/");
     System.out.println("i am printing statment 1");
    Reporter.log("hi i  am reporter log");
    Reporter.log("hi i am reporter log with string", true);
  }
  
}
