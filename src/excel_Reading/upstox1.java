package excel_Reading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstox1 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("userCode")).sendKeys("2VB5QJ");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("Velocity@22");
		driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("yob")).sendKeys("2000");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		
		
		
		
	}

}
