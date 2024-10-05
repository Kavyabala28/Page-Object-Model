package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramExecution;

public class CreateAccountPage extends ProgramExecution{

	public CreateAccountPage accountName() {
		getDriver().findElement(By.id("accountName")).sendKeys("Account1");
		return this;
	}
	
	public CreateAccountPage localName() {
		getDriver().findElement(By.id("groupNameLocal")).sendKeys("Leo");
		return this;
	}
	
	public AccountsPage createAccountBtn() {
		getDriver().findElement(By.className("smallSubmit")).click();
		return new AccountsPage();
	}
}
