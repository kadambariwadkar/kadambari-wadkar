package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedStudy1 {

	public static void main(String[] args) throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		Thread.sleep(500);
driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(500);
		// WebElement Female = driver.findElement(By.xpath("//input[@value='1']"));
		driver.findElement(By.xpath("//input[@value='1']"));
		 //Thread.sleep(5000);
		// boolean Result = Female.isSelected();
		// Thread.sleep(5000);
		//System.out.println(Result);

	}

}
