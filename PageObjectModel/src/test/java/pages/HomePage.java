package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramExecution;

public class HomePage extends ProgramExecution {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public void leadsTab() {
		driver.findElement(By.linkText("Leads")).click();
    }

	public AccountsPage accountsTab() {
		driver.findElement(By.linkText("Accounts")).click();
		return new AccountsPage(driver);
	}
}
