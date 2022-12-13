package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clearMethosStudy {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/mantra");
	driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("kids");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).clear();
		
		Thread.sleep(1000);
		driver.close();
	}

}
