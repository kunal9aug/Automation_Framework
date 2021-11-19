package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utils.BaseClass;
import pages.Leave;

public class LeaveTests extends BaseClass {
	
	Leave leave = new Leave(driver);
	
	@BeforeClass
	public void BeforeClass() {
		leave = new Leave(BaseClass.driver);
	}
	
	@Test
	public void Leave_Test_01_Apply_Leave() {
		leave.Hover_On_Leave();
		leave.Click_On_Assign_Leave();
		leave.Type_Employee_Name();
		leave.Select_From_Date();
		leave.Select_Vacation_Type();
		leave.Click_On_Apply_Button();
	}
}
