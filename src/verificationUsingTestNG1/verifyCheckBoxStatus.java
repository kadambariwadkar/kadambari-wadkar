package verificationUsingTestNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyCheckBoxStatus {
  @Test
  public void verifyCheckBoxStatus1() 
  {
	 // System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
	 checkbox.click();
	 Assert.assertTrue(checkbox.isSelected(),"test case is failed check box is not selected");
	 
	  
	  
  }
}
