package studyA_To_Z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();Thread.sleep(500);
		Actions act =new Actions(driver);
		
		driver.findElement(By.xpath("//div[text()='Fashion']"));
		Thread.sleep(100);
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Thread.sleep(100);
		act.moveToElement(fashion).perform();	
		Thread.sleep(100);
		WebElement mens = driver.findElement(By.className("_6WOcW9 _2-k99T"));
		Thread.sleep(100);
		act.moveToElement(mens).click();
		
		
		
		
		
		
		
		Thread.sleep(10000);
	//driver.close();	
	}
}