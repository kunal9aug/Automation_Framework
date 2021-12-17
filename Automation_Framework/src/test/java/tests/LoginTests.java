package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Utils.BaseClass;
import pages.Login;

public class LoginTests extends BaseClass {
	Login login = new Login();
	
	@Test
	public void Login_TC1() {
		login.Open_Application();
		login.Enter_Username("Admin");
		login.Enter_Password("admin123");
		login.Click_On_Login_Button();
		assertEquals(driver.getTitle(),"OrangeHRM");
		report.log(Status.PASS, "Test Case Passed");
	}

}
