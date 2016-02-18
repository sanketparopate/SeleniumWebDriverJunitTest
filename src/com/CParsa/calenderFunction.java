package com.CParsa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

public class calenderFunction {
	
	@Test
	public void calFunctionTest(){
		DateFormat dateFormat= new SimpleDateFormat("MM/dd/yyyy hh:mm aa");

		Calendar calender = Calendar.getInstance();    
		System.out.println(dateFormat.format(calender.getTime()));
		calender.setTime(new Date());
		calender.add(Calendar.DATE, 3);
		System.out.println(dateFormat.format(calender.getTime()));
	
		/*Date date=new Date();
		SimpleDateFormat dateWithTime = new SimpleDateFormat("yyyy-mm-dd hh:mm aa");*/
	}

}
