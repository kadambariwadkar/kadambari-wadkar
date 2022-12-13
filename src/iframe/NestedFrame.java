package iframe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NestedFrame {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes"); 
		String text = driver.findElement(By.xpath("//div[text()='Nested Frames']")).getText();
		System.out.println(text);
		driver.switchTo().frame("frame1");
		String parenttext = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println("frame 1 text is = "+parenttext);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe [@srcdoc='<p>Child Iframe</p>']")));
         String frame2text = driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();	
         System.out.println("frame 2 "+frame2text);
         driver.switchTo().defaultContent();
         System.out.println("main frame "+text);
	}
}
