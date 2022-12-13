package Actionclassstudy;

//import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;

public class eg1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	 Actions act = new Actions(driver);
	 Thread.sleep(1000);
	 WebElement refElement = driver.findElement(By.linkText("BANK"));
	 act.moveToElement(refElement).perform();
	 Thread.sleep(1000);
	 //WebElement blink = driver.findElement(By.linkText("Bank Project"));
	 //act.moveToElement(blink).perform();
	 //act.click().perform();
	 WebElement selen = driver.findElement(By.className("dropdown-toggle"));
	 act.moveToElement(selen).click().build().perform();
	 WebElement seln = driver.findElement(By.className("dropdown-toggle"));
	 act.moveToElement(seln).click().build().perform();
	WebElement amt = driver.findElement(By.linkText("5000"));
	WebElement target = driver.findElement(By.id("amt8"));
	act.dragAndDrop(amt, target).perform();
	}

}
