package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utilities.BaseClass;

public class AccountRegistrationPage {

	public AccountRegistrationPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	@FindBy(xpath="//h1[text()='Register Account']")
	public WebElement pageTitle;
	
	@FindBy(xpath="//input[@id='input-firstname']")
	public WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	public WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	public WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	public WebElement txtPhone;
	
	@FindBy(xpath="//input[@id='input-password']")
	public WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	public WebElement txtConfirmPassword;
	
	@FindBy(xpath="//div[@class='form-group']//input")
	public List<WebElement> NewsletterRadioBox;
	
	@FindBy(xpath="//input[@name='agree']")
	public WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement btnContinue;
	
	@FindBy(xpath="//div[@class='text-danger']")
	public List<WebElement> errorMsg;
	
	@FindBy(xpath="//div[@id='content']/h1")
	public WebElement msgConfirmation;
	
	
}//Class
