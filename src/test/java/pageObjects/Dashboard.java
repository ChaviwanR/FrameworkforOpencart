package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class Dashboard  {

	public Dashboard() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	public WebElement pageName;
	
	@FindBy(xpath="//div[@class='oxd-sidepanel-body']/div")
	public  WebElement searchBox;
	
	@FindBy(xpath="//div[@class='oxd-sidepanel-body']//li")
	public List<WebElement> rightMenu;
	
	
	
	
	
	
	
	
	
	
}//Class
