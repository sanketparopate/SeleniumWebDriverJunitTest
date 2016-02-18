package com.CParsa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class TimeKMiliseconds {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy HH:mm:ss");
	String dateInString = "11-01-16 10:21:24";
	Date date = sdf.parse(dateInString);
		
	System.out.println(dateInString);
	System.out.println("Date - Time in milliseconds : " + date.getTime());

	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date);
	System.out.println("Calender - Time in milliseconds : " + calendar.getTimeInMillis());
	}

}
