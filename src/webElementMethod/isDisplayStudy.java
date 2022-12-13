package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayStudy {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		WebElement password = driver.findElement(By.name("pass"));
System.out.println("password text box is  "+password.isDisplayed());
driver.navigate().to("https://en-gb.facebook.com/");

driver.manage().window().maximize();

Thread.sleep(3000);

//use of link text and partial link text
//driver.findElement(By.linkText("Forgotten account?")).click();

//driver.findElement(By.partialLinkText("Forgotten")).click();


driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

Thread.sleep(8000);

//System.out.println(driver.findElement(By.xpath("//input[@value='1']")).isSelected());

 WebElement Female = driver.findElement(By.xpath("//input[@value='1']"));
 
 boolean Result = Female.isSelected();
 
 System.out.println(Result);
 
 Thread.sleep(2000);
 
 Female.click();
 
 Thread.sleep(2000);
 boolean Result1 = Female.isSelected();
 
 System.out.println(Result1);

		
	}

}
