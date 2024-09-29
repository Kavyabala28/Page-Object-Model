package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramExecution;

public class LoginPage extends ProgramExecution{

	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage userName() {
		driver.findElement(By.id("username")).sendKeys(ps.getProperty("username"));
		return this;
	}
	
	public LoginPage password() {
		driver.findElement(By.id("password")).sendKeys(ps.getProperty("password"));
		return this;
	}
	
	public WelcomePage login() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
	}
}
