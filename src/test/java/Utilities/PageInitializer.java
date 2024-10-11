package Utilities;


import pageObjects.AccountRegistrationPage;
import pageObjects.Dashboard;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class PageInitializer extends BaseClass{

	public static Dashboard dp;
	public static AccountRegistrationPage ap;
	public static HomePage hp;
	public static LoginPage lp;
	public static MyAccountPage mp;
	
	
	
	public static void initialize() {
		dp = new Dashboard();
		ap = new AccountRegistrationPage();
		hp = new HomePage();
		lp = new LoginPage();
		mp = new MyAccountPage();
	}
}
