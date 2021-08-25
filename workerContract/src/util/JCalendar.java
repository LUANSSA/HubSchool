package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class JCalendar {;
	public String[] years;
	public String months[] = {"January","February","March","April",
								"May","June","July","August","September",
								"October","November","December"};
	
	public String days[] 
		= { "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
	
	protected Date date = new Date(System.currentTimeMillis());
	
	
	//Constructor
	public JCalendar(){
		int qtyear = this.getYear()+1 - 1900;
		this.years = new String[qtyear];
	}
	
	//returns an array of Strings with the years
	public String[] getYears() {
		int year = this.getYear();
		int qt = 0;
		for(int i = year; i > 1899; i--) {
			years[qt] = (String)""+i+"";
			qt++;
		}
		
		return years;
		
	}
	//Return months
	public String[] getMonths(){
		return this.months;
	}
	
	//Return days
	public String[] getDays() {
		return this.days;
	}
	//Return if the year is Leap year;
	public boolean getLeapYear(String year) {
		Integer leapYear = Integer.parseInt(year);
		if(leapYear%4 == 0 && leapYear%100 == 0 && leapYear%400 == 0)
			return true;
		return false;
	}	
	
	//Check the number of days in the month
	public String[] getCheckMonth(String month, String year) {
		if(month.equals("April")||month.equals("June")||month.equals("September")||month.equals("November")) {
			this.getDays()[30] = "";
		}
		else if(month.equals("February")){
			if(this.getLeapYear(year)) {
				this.getDays()[30] = "";
				this.getDays()[29] = "";
			}
			else {
				this.getDays()[30] = "";
				this.getDays()[29] = "";
				this.getDays()[28] = "";
			}
		}
		return this.getDays();
	}
	
	//Check the current year and return
	protected Integer getYear() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dayMonthYear[] = sdf.format(date).split("/");
		Integer year = Integer.parseInt(dayMonthYear[2]);
		return  year;
	}

}
