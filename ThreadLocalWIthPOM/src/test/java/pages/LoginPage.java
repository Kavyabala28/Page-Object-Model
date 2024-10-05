package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramExecution;

public class LoginPage extends ProgramExecution{

	public LoginPage userName() {
		getDriver().findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
	}
	
	public LoginPage password() {
		getDriver().findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public WelcomePage login() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
