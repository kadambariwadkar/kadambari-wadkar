package neoStoxTestclasses;

import org.testng.annotations.Test;

public class ValidateNeoStoxUserName {
		NeoStoxLoginPage login;
		NeoStoxPasswordPage password;
		NeoStoxHomePage home;

		@BeforeClass
		public void launchNeoStox() throws InterruptedException
		{
		launchBrowser();//form base class
		login= new NeoStoxLoginPage(driver);
		password= new NeoStoxPasswordPage(driver);
		home= new NeoStoxHomePage(driver);
		}

		@BeforeMethod

		public void logintoNeoStox() throws EncryptedDocumentException, IOException,
		InterruptedException
		{
		login.sendMobileNum(driver, Utility.readDataFromExcel(4, 0));
		login.clickOnSignInButton(driver);
		Utility.wait(driver, 1000);
		password.enterPassword(driver, Utility.readDataFromExcel(4, 1));
		Thread.sleep(1000);
		password.clickOnSubmitButton(driver);
		Thread.sleep(1000);
		home.handlePopUp(driver);
		}

		@Test
		public void f()
		{
		}
		}
