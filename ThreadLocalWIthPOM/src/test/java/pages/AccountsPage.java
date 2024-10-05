package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramExecution;

public class AccountsPage extends ProgramExecution{

	public CreateAccountPage createAccount() {
		getDriver().findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
	}
	
	public void findAccounts() {
		getDriver().findElement(By.linkText("Find Accounts")).click();
	}
	
	public void mergeAccounts() {
		getDriver().findElement(By.linkText("Merge Accounts")).click();
	}
}
