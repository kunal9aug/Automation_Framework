package Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
	
	public static String Get_Todays_Date(String format) {
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern(format);  
		 LocalDateTime now = LocalDateTime.now(); 
		 return dtf.format(now);
	}
	
	public static LocalDate Add_Days_To_Get_Future_Date(String input_date,int noOfDays) {
		LocalDate date = LocalDate.parse(input_date);
		LocalDate new_Date = date.plusDays(noOfDays);
		return new_Date;
	}

}
