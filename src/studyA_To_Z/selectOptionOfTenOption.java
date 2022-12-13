package studyA_To_Z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectOptionOfTenOption {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
  		driver.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_CjwKCAjw2OiaBhBSEiwAh2ZSPxPm_Z41UhoEFRPH_8DGtfvbuBEpXfkcrkkWJHgVSWw-opXIA_R6fRoCE8gQAvD_BwE_k_&gclid=CjwKCAjw2OiaBhBSEiwAh2ZSPxPm_Z41UhoEFRPH_8DGtfvbuBEpXfkcrkkWJHgVSWw-opXIA_R6fRoCE8gQAvD_BwE");
        Thread.sleep(1000);    
  		driver.findElement(By.name("q")).sendKeys("kurti")	;
	}

}
