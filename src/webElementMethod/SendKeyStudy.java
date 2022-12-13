package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyStudy {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(100);
		driver.findElement(By.name("enter-name")).sendKeys("hi ");
		
		Thread.sleep(100);
		driver.navigate().to("https://www.myntra.com/mantra");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("kids");
		
		
		
		Thread.sleep(1000);
		driver.close();
		
		
		
		
	}
	

}
