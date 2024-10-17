package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramExecution;

public class WelcomePage extends ProgramExecution {

	public LoginPage logout() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
	}
}
