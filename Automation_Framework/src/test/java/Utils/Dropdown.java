package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends BaseClass{
	
	public static void Select_By_Text(By by,String text) {
		WebElement element = driver.findElement(by);
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

}
