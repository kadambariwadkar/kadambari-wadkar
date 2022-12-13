package waitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwaiteg1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100000));
		WebElement hidetbutton = driver.findElement(By.xpath("//legend[text()='Element Displayed Example'] "));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",hidetbutton);
		System.out.println(hidetbutton.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		WebElement upsroll = driver.findElement(By.xpath("//a[text()='Velocity Corporate Training Center']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView(true)",upsroll);
		System.out.println(upsroll.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

		
	}

}
