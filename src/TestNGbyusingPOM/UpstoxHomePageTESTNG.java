package TestNGbyusingPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxHomePageTESTNG
{
	@FindBy(xpath = "(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userId;
	@FindBy(id = "funds") private WebElement funds;
	@FindBy(xpath = "//div[text()='Logout']") private WebElement logOutButton;
	public UpstoxHomePageTESTNG(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void validateUserID(String expUN)
	{
	String actualUserName = userId.getText();
	if(actualUserName.equals(expUN))
	{
	System.out.println("Actual and Expected UserNAme are matching TC is Passed");
	}
	else
	{
	System.out.println("Actual and Expected UserNAme are not matching TC is Failed");
	}
	}
	public void clickOnFundsButton()
	{
	funds.click();
	}
	public void logout() throws InterruptedException
	{
	userId.click();
	Thread.sleep(500);
	logOutButton.click();

	}
		public String getActualUserID(WebDriver driver) throws IOException, InterruptedException
	{
		String actualUID = userId.getText();
		//scroll to userID
		Thread.sleep(500);
		//CommonlyUsedMethods.scrollIntoView(driver, userId);
		//take screenSHot
		//CommonlyUsedMethods.takeScreenShot(driver, actualUID);
		return actualUID;
		}
}