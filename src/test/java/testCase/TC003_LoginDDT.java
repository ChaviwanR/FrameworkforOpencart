package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;


import Utilities.CommonMethods;
import Utilities.DataProviders;

public class TC003_LoginDDT extends CommonMethods {

	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void verify_loginDDT(String email, String pwd, String expect) {
		try {
		hp.linkMyacc.click();
		hp.linkLogin.click();

		lp.loginEmailTxtBox.sendKeys(email);
		lp.loginPasswordTxtBox.sendKeys(pwd);
		lp.Loginbtn.click();

		if (expect.equalsIgnoreCase("valid")) {
			if (mp.myAccountText.getText().equalsIgnoreCase("My Account")) {
				mp.logoutBtn.click();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}
		
		if (expect.equalsIgnoreCase("invalid")) {
			if (mp.myAccountText.getText().equalsIgnoreCase("My Account")) {
				mp.logoutBtn.click();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
