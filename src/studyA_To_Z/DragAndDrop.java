package studyA_To_Z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		/*WebElement refelement = driver.findElement(By.linkText("SALES"));
		Thread.sleep(1000);
		act.moveToElement(refelement).perform();
		Thread.sleep(100);*/
		WebElement source = driver.findElement(By.linkText("5000"));
		WebElement target = driver.findElement(By.xpath("//ol[@id='amt8']"));
		act.dragAndDrop(source, target).perform();
		
		
		
	}

}
