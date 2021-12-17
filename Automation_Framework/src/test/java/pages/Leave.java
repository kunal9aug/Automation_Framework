package pages;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

import Utils.BaseClass;
import Utils.DateTime;
import Utils.Dropdown;
import Utils.Keyboard;
import Utils.Mouse;
import Utils.Wait;

public class Leave extends BaseClass{
	
	By leave = By.xpath("//b[contains(text(),'Leave')]");
	By assign_Leaves = By.xpath("//a[contains(text(),'Assign Leave')]");
	By employee_Name_Text_Field = By.id("assignleave_txtEmployee_empName");
	By Orange_Test_Dropdown_txt = By.xpath("(//li[contains(text(),'range Test')])[1]");
	By Leave_Type_Dropdown = By.id("assignleave_txtLeaveType");
	By Leave_From_Date_Calendar_Input = By.id("applyleave_txtFromDate");
	By Apply_Button = By.id("applyBtn");
	
	
	public void Hover_On_Leave() {
		Mouse.Hover_On_Element(leave);
		report.log(Status.INFO, "Hover on Leave");
	}
	
	public void Click_On_Assign_Leave() {
		Mouse.Click(assign_Leaves);
		report.log(Status.INFO, "Click on Assign Leaves");
		
	}
	
	public void Type_Employee_Name() {
		Keyboard.sendkeys(employee_Name_Text_Field, "O");
		report.log(Status.INFO, "Type [O] in input text field");
		Wait.Wait_Until_Element_Visible(Orange_Test_Dropdown_txt, 10);
		report.log(Status.INFO, "Wait for dropdown Element to show up");
		Mouse.Click(Orange_Test_Dropdown_txt);
		report.log(Status.INFO, "Select the word from dropdown");
	}
	
	public void Select_Vacation_Type() {
		Dropdown.Select_By_Text(Leave_Type_Dropdown, "CAN - Bereavement");
		report.log(Status.INFO, "Select the leave type from dropdown");
	}
	
	public void Select_From_Date() {
		Keyboard.sendkeys(Leave_From_Date_Calendar_Input, DateTime.Get_Todays_Date("yyyy-mm-dd"));
		report.log(Status.INFO, "Select From date from Calendar");
	}
	
	public void Click_On_Apply_Button() {
		Mouse.Click(Apply_Button);
		report.log(Status.INFO, "Click on Apply Button");
	}

}
