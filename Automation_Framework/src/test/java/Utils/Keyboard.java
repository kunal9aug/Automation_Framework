package Utils;
import org.openqa.selenium.*;
public class Keyboard extends BaseClass {
	
	public static void sendkeys(By by,String keys_To_Send) {
		driver.findElement(by).sendKeys(keys_To_Send);
	}

}
