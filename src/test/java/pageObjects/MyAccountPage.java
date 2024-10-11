package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class MyAccountPage {

	
	public MyAccountPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	public WebElement myAccountText;
	
	
	@FindBy(xpath="//div[@class='list-group']//*[text()='Logout']")
	public WebElement logoutBtn;
	
	
	
}
