package studyA_To_Z;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class how_many_links_on_webpage {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("link ar"+links.size());//size of links
		//what are those link
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next().getText());
		}
	}

}
