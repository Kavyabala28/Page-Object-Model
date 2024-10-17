package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ProgramExecution {
	
	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	
	public ExtentReports extent;
	public static ExtentTest test;
	public String testCaseName, testCaseDescription, authorName, categoryName;
	
	public RemoteWebDriver getDriver() {
		return rd.get();
	}

	public void setDriver() {
		rd.set(new ChromeDriver());
	}
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter report = new ExtentHtmlReporter("./report/result.html");
		report.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(report);
	}
	
	@BeforeClass
	public void setReport() {
		test = extent.createTest(testCaseName, testCaseDescription);
		test.assignAuthor(authorName);
		test.assignCategory(categoryName);
	}
	
	public int takeSnap() throws IOException {
		int random = (int) ((Math.random())*99999);
		File src = getDriver().getScreenshotAs(OutputType.FILE);
		File desc = new File("./Snaps/img"+random+".png");
		FileUtils.copyFile(src, desc);
		return random;
	}
	
	public void reportStatus(String status, String description) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
			test.pass(description, MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/img"+takeSnap()+".png").build());
		}else if (status.equalsIgnoreCase("fail")) {
			test.fail(description, MediaEntityBuilder.createScreenCaptureFromPath(".././Snaps/img"+takeSnap()+".png").build());
		}
	}

	@BeforeMethod
	public void preCondition() {
		setDriver();
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}
	
	@AfterSuite
	public void endReport() {
		extent.flush();
	}
}
