package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hide_and_show {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement textbox = driver.findElement(By.id("displayed-text"));
		textbox.sendKeys("i am awesome");
		Thread.sleep(2000);
		WebElement hide = driver.findElement(By.id("hide-textbox"));
		WebElement show = driver.findElement(By.id("show-textbox"));
		Thread.sleep(2000);
		//hide.click();
		Thread.sleep(2000);
		if(hide.isDisplayed())
		{
			textbox.sendKeys("i am not hide");
		}
		else
		{
			System.out.println("text box is not displyed, plz check");
		}
		Thread.sleep(2000);
		hide.click();
		Thread.sleep(1000);
		show.click();
	}

}
