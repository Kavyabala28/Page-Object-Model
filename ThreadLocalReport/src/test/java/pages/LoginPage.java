package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.ProgramExecution;

public class LoginPage extends ProgramExecution {

	public LoginPage userName() throws IOException {
		try {
			getDriver().findElement(By.id("username")).sendKeys("demosalesmanager");

			/*
			 * File src = getDriver().getScreenshotAs(OutputType.FILE); File desc = new
			 * File("./Snaps/img.png"); FileUtils.copyFile(src, desc);
			 * test.pass("Username entered Successfully",
			 * MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/img.png").build())
			 * ;
			 */
			reportStatus("pass", "Username entered successfully");

		} catch (Exception e) {
			/*
			 * File src = getDriver().getScreenshotAs(OutputType.FILE); File desc = new
			 * File("./Snaps/img.png"); FileUtils.copyFile(src, desc);
			 * test.fail("Username not entered",
			 * MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/img.png").build())
			 * ;
			 */
			reportStatus("fail", "Username not entered" + e);
		}
		return this;
	}

	public LoginPage password() throws IOException {
		try {
			getDriver().findElement(By.id("password")).sendKeys("crmsfa");
			reportStatus("pass", "Password entered successfully");
		} catch (Exception e) {
			reportStatus("fail", "Password not entered" + e);
		}
		return this;
	}

	public WelcomePage login() throws IOException {
		try {
			getDriver().findElement(By.className("decorativeSubmit")).click();
			reportStatus("pass", "Login successfully");
		} catch (Exception e) {
			reportStatus("fail", "Login was unsuccessful" + e);
		}
		return new WelcomePage();
	}
}
