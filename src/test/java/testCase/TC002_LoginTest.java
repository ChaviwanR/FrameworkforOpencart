package testCase;


import org.testng.Assert;
import org.testng.annotations.Test;

import Utilities.BaseClass;
import Utilities.CommonMethods;

public class TC002_LoginTest extends CommonMethods {

	@Test
	public void verify_login() {
		hp.linkMyacc.click();
		hp.linkLogin.click();
		lp.loginEmailTxtBox.sendKeys(BaseClass.getProperty("email"));
		lp.loginPasswordTxtBox.sendKeys(BaseClass.getProperty("password"));
		lp.Loginbtn.click();
		
		Assert.assertEquals(mp.myAccountText.getText(),"My Account");
	
	}
	
	
}
