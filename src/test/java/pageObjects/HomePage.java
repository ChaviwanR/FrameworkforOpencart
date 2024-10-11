package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//div[@id='top-links']//li[2]//span[1]")
	public WebElement linkMyacc;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li[1]")
	public WebElement linkRegister;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']/li[2]")
	public WebElement linkLogin;
	

}
