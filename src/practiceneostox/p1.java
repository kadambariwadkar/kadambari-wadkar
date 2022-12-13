package practiceneostox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://neostox.com/");
			Thread.sleep(1000);
			driver.findElement(By.name("ctl00$MainContent$signinsignup$txt_mobilenumber")).sendKeys("8080138855");
			driver.findElement(By.id("lnk_signup1")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("ctl00$MainContent$_wp_enteraccesspin$txt_accesspin")).sendKeys("1369");
			driver.findElement(By.id("lnk_submitaccesspin")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//a[text()='OK'])[2]")).click();
			driver.findElement(By.xpath("(//a[text()='Close'])[5]")).click();
			String actualname = driver.findElement(By.xpath("//span[@id='lbl_username']")).getText();
			String expectedname="Hi Kadambari";
			if (actualname.equals(expectedname))
			{
				System.out.println("string maching");
			}
			else {
				System.out.println("string not maching");
			}
			String acbal = driver.findElement(By.xpath("//span[@id='lbl_curbalancetop']")).getText();
			System.out.println("ac bal is "+acbal);
	}

}
