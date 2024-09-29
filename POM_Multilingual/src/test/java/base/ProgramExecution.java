package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class ProgramExecution {

	public ChromeDriver driver;
	public static Properties ps;

	@Parameters({"langFile"})
	@BeforeMethod
	public void preCondition(String fileName) throws IOException {
		
		FileInputStream fs = new FileInputStream("src/test/resources/"+fileName+"Language.properties");
		
		ps = new Properties();
		
		ps.load(fs);
		
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
