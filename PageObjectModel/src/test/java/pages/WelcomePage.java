package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramExecution;

public class WelcomePage extends ProgramExecution {

	public WelcomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public HomePage crmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage(driver);
	}

	public LoginPage logout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
}
