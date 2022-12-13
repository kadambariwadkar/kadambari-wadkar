package studyA_To_Z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.switchTo().frame("courses-iframe");
		// switching selenium focus from main page to iframe
		String myText = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity')]")).getText();
		System.out.println(myText);
		driver.switchTo().defaultContent();// switching selenium focus from iframe to main page
		String myText1 = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']")).getText();
		System.out.println(myText1);
	}

}
