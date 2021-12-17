package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	 public void onTestStart(ITestResult result) {
		    System.out.println("=================================================="+result.getName()+"===========================");
		    BaseClass.report = BaseClass.extent.createTest(result.getName());
		  }

	
	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		 System.out.println("Test Successfully Executed");
		  }

		  /**
		   * Invoked each time a test fails.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#FAILURE
		   */
	 public void onTestFailure(ITestResult result) {
		 //String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		 String timeStamp = String.valueOf(System.currentTimeMillis());
		    // not implemented
		 System.out.println("Test Failure");
		 File Screenshot = ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
		 File pathOfScreenshot = new File("Output/Screenshots/"+result.getName()+"_"+timeStamp+".png");
		 try {
			FileUtils.copyFile(Screenshot,pathOfScreenshot);
			BaseClass.report.addScreenCaptureFromPath(pathOfScreenshot.getAbsolutePath());
			BaseClass.report.fail("Test Case "+result.getName()+"Failed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }

}