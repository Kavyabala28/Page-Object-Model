package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProgramExecution;

public class WelcomePage extends ProgramExecution {

	public LoginPage logout() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStatus("pass", "Logout Successfully");
		} catch (Exception e) {
			reportStatus("fail", "Logout was Unsuccessfull");
		}
		return new LoginPage();
	}

	public HomePage crmsfa() throws IOException {
		try {
			getDriver().findElement(By.linkText("CRM/SFA")).click();
			reportStatus("pass", "Clicked CRMSFA Link");
		} catch (Exception e) {
			reportStatus("pass", "Not Clicked CRMSFA Link");
		}
		return new HomePage();
	}
}
