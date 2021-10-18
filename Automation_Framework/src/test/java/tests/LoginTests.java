package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pages.Login;

import Utils.BaseClass;

public class LoginTests extends BaseClass {
	Login login;
	@BeforeClass
	public void BeforeClass() {
		login = new Login(BaseClass.driver);
	}
	
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
