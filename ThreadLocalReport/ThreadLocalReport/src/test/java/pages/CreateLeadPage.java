package pages;

import java.io.IOException;

import org.openqa.selenium.By;

import base.ProgramExecution;

public class CreateLeadPage extends ProgramExecution{

	public CreateLeadPage enterCompanyName(String cname) throws IOException {
		try {
			getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
			reportStatus("pass", "Company Name entered successfully");
		} catch (Exception e) {
			reportStatus("fail", "Company Name was not entered");
		}
		return this;
	}
	
	public CreateLeadPage enterFirstName(String fname) throws IOException {
		try {
			getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
			reportStatus("pass", "First Name entered successfully");
		} catch (Exception e) {
			reportStatus("fail", "First Name was not entered");
		}
		return this;
	}
	
	public CreateLeadPage enterLastName(String lname) throws IOException {
		try {
			getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
			reportStatus("pass", "Last Name entered successfully");
		} catch (Exception e) {
			reportStatus("fail", "Last Name was not entered");
		}
		return this;
	}
	
	public HomePage clickCreateLeadBtn() throws IOException {
		try {
			getDriver().findElement(By.className("smallSubmit")).click();
			reportStatus("pass", "Clicked Create Lead Button");
		} catch (Exception e) {
			reportStatus("fail", "Not Click Create Lead button");
		}
		return new HomePage();
	}

	
}