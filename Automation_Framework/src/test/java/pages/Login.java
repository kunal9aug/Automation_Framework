package pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import Utils.BaseClass;

public class Login extends BaseClass{
	
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By loginBtn = By.id("btnLogin");
	

	public void Open_Application() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		report.log(Status.INFO, "Opened URL of Application");
	}
	
	public void Enter_Username(String Username) {
		driver.findElement(username).sendKeys(Username);
		report.log(Status.INFO, "Entering Username : " +Username);
	}
	
	public void Enter_Password(String Password) {
		driver.findElement(password).sendKeys(Password);
		report.log(Status.INFO, "Entering Password : " +Password);
	}
	
	public void Click_On_Login_Button() {
		driver.findElement(loginBtn).click();
		report.log(Status.INFO, "Clicking on Sign In button ");
	}
}
