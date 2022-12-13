package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextUse {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007788%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjwnbmaBhD-ARIsAGTPcfXMfjM9YtvYEkrJVFONV3NWJ3fHGzpErnSGdY-3sYWpwhkfxjJJczsaAl1gEALw_wcB");
	driver.manage().window().maximize();
	Thread.sleep(500);
	String text = driver.findElement(By.xpath("//div[text()='Create a new account']")).getText();
	System.out.println("my text is "+text);
	Thread.sleep(1000);
	
	driver.navigate().to("https://vctcpune.com/selenium/practice.html");
	
	String textv = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
	
 System.out.println("velocity text is   "+textv);

//Thread.sleep(1000);
//driver.close();
	}

}
