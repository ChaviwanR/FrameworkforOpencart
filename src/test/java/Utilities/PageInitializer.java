package Utilities;


import pageObjects.AccountRegistrationPage;
import pageObjects.Dashboard;
import pageObjects.HomePage;

public class PageInitializer extends BaseClass{

	public static Dashboard dp;
	public static AccountRegistrationPage ap;
	public static HomePage hp;
	
	
	
	public static void initialize() {
		dp = new Dashboard();
		ap = new AccountRegistrationPage();
		hp = new HomePage();
	}
}
