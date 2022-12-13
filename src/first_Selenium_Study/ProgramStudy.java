package first_Selenium_Study;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramStudy {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		//how many links present in google page

		List<WebElement> link = driver.findElements(By.tagName("a"));

		System.out.println(link.size());

		//what are links present in google page

		Iterator<WebElement> l = link.iterator();
		while(l.hasNext())
		{
		System.out.println(l.next().getText());
		}
	}

}
