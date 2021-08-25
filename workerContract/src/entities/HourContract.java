package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HourContract {

	private Date date;
	private double valuePerHour;
	private double hours;
	
	
	public HourContract() {
		date = new Date();
	}
	
	public Date getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double valuePerHour() {
		return this.valuePerHour;
	}
	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	public double getHours() {
		return this.hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	
	
}
