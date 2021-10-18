package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouse extends BaseClass{
	
	public static void Hover_On_Element(By by) {
		WebElement element = driver.findElement(by);
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void Click (By by) {
		driver.findElement(by).click();
	}

}
