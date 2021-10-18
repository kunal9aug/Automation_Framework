package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends BaseClass{
	
	@SuppressWarnings("deprecation")
	public static void Wait_Until_Element_Visible(By by,long timeUnit) {
		WebDriverWait wait = new WebDriverWait(driver, timeUnit);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
