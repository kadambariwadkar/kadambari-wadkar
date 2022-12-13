package studyA_To_Z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifram_eg1 {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		String frame1 = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println(frame1);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
	}

}
