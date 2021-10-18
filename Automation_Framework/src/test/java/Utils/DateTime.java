package Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	
	public static String Get_Todays_Date(String format) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);  
		 LocalDateTime now = LocalDateTime.now(); 
		 return dtf.format(now);
	}

}
