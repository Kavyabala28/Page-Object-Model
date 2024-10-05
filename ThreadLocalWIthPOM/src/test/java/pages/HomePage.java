package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramExecution;

public class HomePage extends ProgramExecution {

	public void leadsTab() {
		getDriver().findElement(By.linkText("Leads")).click();
    }

	public AccountsPage accountsTab() {
		getDriver().findElement(By.linkText("Accounts")).click();
		return new AccountsPage();
	}
}
