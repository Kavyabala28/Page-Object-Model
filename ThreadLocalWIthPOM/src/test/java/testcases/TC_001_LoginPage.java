package testcases;

import org.testng.annotations.Test;

import base.ProgramExecution;
import pages.LoginPage;

public class TC_001_LoginPage extends ProgramExecution{

	@Test
	public void runLoginPage() {
		LoginPage lp = new LoginPage();
		lp.userName().password().login();
	}
}