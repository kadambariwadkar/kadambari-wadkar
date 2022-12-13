package studyA_To_Z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions act =new Actions(driver);
		Thread.sleep(100);
		WebElement refElement = driver.findElement(By.linkText("LOAN"));
		act.moveToElement(refElement).perform();
		Thread.sleep(100);
		/*WebElement clickme = driver.findElement(By.xpath("(//a[contains(text(),'Selenium')])[2]"));
		act.moveToElement(clickme).perform();
		Thread.sleep(700);
		act.click().perform();
		act.moveToElement(clickme).click().build().perform();//combine code 24 and 26 line
		 act.click(clickme).perform();*/
		//Mouse action--> Drag and Drop
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement target = driver.findElement(By.id("amt8"));
	//act.moveToElement(source).clickAndHold().release(target).build().perform();
		act.dragAndDrop(source, target).perform();

	}

}
