package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpStoxTest1 {

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		Thread.sleep(1000);
		//create object of loginPage
		UpStoxLoginPage login= new UpStoxLoginPage(driver);
		login.enterUserID();
		login.enterPassword();
		login.clickOnSignInButton();
		
		Thread.sleep(1000);
		//create object of passCode page
		UpStoxPassCodePage passcode= new UpStoxPassCodePage(driver);
		passcode.enterPassCode();
		
		Thread.sleep(12000);
		//create object of welcome page
		UpStoxWelcomePage welcome= new UpStoxWelcomePage(driver);
		welcome.clickOnNoIamGoodButton();

		Thread.sleep(1000);
		//create object of Home Page
		UpStoxHomePage home= new UpStoxHomePage(driver);
		home.validateUserID();
		home.clickOnFundsButton();
		
		Thread.sleep(1000);
		//create object of funds page
		UpStoxFundsPage funds= new UpStoxFundsPage(driver);
		funds.getMyFunds();
		
		Thread.sleep(1000);
		//logout
		logout out = new logout(driver);
		out.logout_click();
		
		
		
		

	}

}
