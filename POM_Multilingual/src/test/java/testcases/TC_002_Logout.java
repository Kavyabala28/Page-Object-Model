package testcases;

import org.testng.annotations.Test;

import base.ProgramExecution;
import pages.LoginPage;

public class TC_002_Logout extends ProgramExecution{
	
	@Test
	public void logoutRun() {
		LoginPage lp = new LoginPage(driver);
		lp.userName().password().login().logout();
	}

}
