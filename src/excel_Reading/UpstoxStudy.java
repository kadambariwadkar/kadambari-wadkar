package excel_Reading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpstoxStudy {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("userId")).sendKeys("2VB5QJ");
		driver.findElement(By.name("password")).sendKeys("Velocity@22");
		driver.findElement(By.id("submit-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("yob")).sendKeys("2000");
		Thread.sleep(100000);
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		Thread.sleep(100);
		/*String actualUN = driver.findElement(By.xpath("(//span[@class='_3YI_lRyLDAFhz2WE6yGuX'])[2]")).getText();
		String expectedUN="Kunal A.";
		Thread.sleep(5000);
		if(actualUN.equals(expectedUN))
		{
		System.out.println("Username matching TC is Passed");
		}
		else {
		System.out.println("Username not matching TC is Failed");
		}
		Thread.sleep(5000);
		driver.findElement(By.id("funds")).click();
		Thread.sleep(5000);
		String myFunds = driver.findElement(By.xpath("((//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[1]//div)[3]")).getText();
				System.out.println("Fund Available to trade is "+myFunds);
	*/}
	}
