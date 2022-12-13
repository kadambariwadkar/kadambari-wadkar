package upStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout 
{
	@FindBy(xpath="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]")private WebElement  userId;
	@FindBy(xpath = "//div[text()='Logout']") private WebElement logOutButton;
	public logout(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void logout_click() throws InterruptedException
	{
	userId.click();
	Thread.sleep(500);
	logOutButton.click();
	}


}
