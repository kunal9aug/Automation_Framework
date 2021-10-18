package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.DateTime;
import Utils.Dropdown;
import Utils.Keyboard;
import Utils.Mouse;
import Utils.Wait;

public class Leave {
	WebDriver driver;
	
	By leave = By.xpath("//b[contains(text(),'Leave')]");
	By assign_Leaves = By.xpath("//a[contains(text(),'Assign Leave')]");
	By employee_Name_Text_Field = By.id("assignleave_txtEmployee_empName");
	By Orange_Test_Dropdown_txt = By.xpath("(//li[contains(text(),'range Test')])[1]");
	By Leave_Type_Dropdown = By.id("assignleave_txtLeaveType");
	By Leave_From_Date_Calendar_Input = By.id("applyleave_txtFromDate");
	
	
	public Leave(WebDriver driver) {
		this.driver=driver;
	}
	
	public void Hover_On_Leave() {
		Mouse.Hover_On_Element(leave);
	}
	
	public void Click_On_Assign_Leave() {
		Mouse.Click(assign_Leaves);
	}
	
	public void Type_Employee_Name() {
		Keyboard.sendkeys(employee_Name_Text_Field, "O");
		Wait.Wait_Until_Element_Visible(Orange_Test_Dropdown_txt, 10);
		Mouse.Click(Orange_Test_Dropdown_txt);
	}
	
	public void Select_Vacation_Type() {
		Dropdown.Select_By_Text(Leave_Type_Dropdown, "CAN - Bereavement");
	}
	
	public void Select_From_Date() {
		Keyboard.sendkeys(Leave_From_Date_Calendar_Input, DateTime.Get_Todays_Date("yyyy-mm-dd"));
	}

}
