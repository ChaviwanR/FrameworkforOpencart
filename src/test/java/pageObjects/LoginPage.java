package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(id= "input-email")
	public WebElement loginEmailTxtBox;
	
	@FindBy(id= "input-password")
	public WebElement loginPasswordTxtBox;
	
	@FindBy(xpath= "//input[@class='btn btn-primary']")
	public WebElement Loginbtn;
	

}
