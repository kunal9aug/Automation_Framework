package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	static ExtentReports extent;
	public static ExtentTest report;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Test-Report.html");
		extent.attachReporter(spark);
		//report = extent.createTest("New Test");
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
		System.out.println("ENDED");
		driver.quit();
	}

}
