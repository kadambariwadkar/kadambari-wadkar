package neoStoxTestclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import neoStoxPOMclasses.NeoStoxHomePage;
import neoStoxPOMclasses.NeoStoxLoginPage;

public class ValidateNeoStoxUserName extends Base
{
	NeoStoxLoginPage login;
	NeoStoxLoginPage password;
	NeoStoxHomePage home;
	@BeforeClass
	public void launchNeoStox() 
	{
		launchBrowser();//form base class
		login= new NeoStoxLoginPage(driver);
		password= new NeoStoxPasswordPage(driver);
		home= new NeoStoxHomePage(driver);
		}

	@BeforeMethod
  @Test
  public void f() {
  }
}
