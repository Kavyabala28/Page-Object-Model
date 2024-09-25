package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramExecution;

public class CreateAccountPage extends ProgramExecution{

	public CreateAccountPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public CreateAccountPage accountName() {
		driver.findElement(By.id("accountName")).sendKeys("Account1");
		return this;
	}
	
	public CreateAccountPage localName() {
		driver.findElement(By.id("groupNameLocal")).sendKeys("Leo");
		return this;
	}
	
	public AccountsPage createAccountBtn() {
		driver.findElement(By.className("smallSubmit")).click();
		return new AccountsPage(driver);
	}
}
