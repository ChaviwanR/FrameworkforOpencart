package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Utilities.BaseClass;
import Utilities.CommonMethods;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccoutRegistrationTest extends CommonMethods {

	
	@Test
	public void verify_acc_registration() {
		hp.linkMyacc.click();
		hp.linkRegister.click();
	
		Assert.assertEquals(ap.pageTitle.getText(), "Register Account");
		
		ap.txtFirstName.sendKeys(CommonMethods.createRandom("firstname"));
		ap.txtLastName.sendKeys(CommonMethods.createRandom("lastname"));
		ap.txtEmail.sendKeys(CommonMethods.createRandom("email"));
		ap.txtPhone.sendKeys(CommonMethods.createRandom("telephone"));
		String passWord = CommonMethods.createRandom("password");
		ap.txtPassword.sendKeys(passWord);
		ap.txtConfirmPassword.sendKeys(passWord);
		
		CommonMethods.clickRadioOrChkbox(ap.NewsletterRadioBox, "1");
		ap.chkdPolicy.click();
		ap.btnContinue.click();
		
		Assert.assertEquals(ap.msgConfirmation.getText(), "Your Account Has Been Created!");
		
		
		
	}
	
	
	
	
	
}
