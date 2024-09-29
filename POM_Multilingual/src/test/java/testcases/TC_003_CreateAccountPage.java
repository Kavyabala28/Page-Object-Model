package testcases;

import org.testng.annotations.Test;

import base.ProgramExecution;
import pages.LoginPage;

public class TC_003_CreateAccountPage extends ProgramExecution{

	@Test
	public void runCreateAccount() {
		LoginPage lb = new LoginPage(driver);
		lb.userName().password().login().crmsfa().accountsTab()
		.createAccount().accountName().localName().createAccountBtn();
	}
}
