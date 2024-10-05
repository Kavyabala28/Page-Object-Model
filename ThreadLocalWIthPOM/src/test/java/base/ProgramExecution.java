package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProgramExecution {
	
	/*
	 * ThreadLocal helps to isolate data or state information specific to an
	 * individual thread.
	 */
	
	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	
	/*
	 * Since we used private modifier, we have to generate getters and setters to
	 * access those variables
	 */
	
	public RemoteWebDriver getDriver() {
		return rd.get();
	}

	public void setDriver() {
		rd.set(new ChromeDriver());
	}
	
	//public ChromeDriver driver;

	@BeforeMethod
	public void preCondition() {
		setDriver();
		
		//driver = new ChromeDriver();
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}
}
