import java.util.Calendar;

/*
 
				Create a class called Date that includes three instance variables—a 
				month (type int), a day (type int) and a year (type int). Provide a constructor 
				that initializes the three instance variables and assumes that the values 
				provided are correct. Provide a set and a get method for each instance 
				variable. Provide a method displayDate that displays the month, day and 
				year separated by forward slashes (/). Write a test application named 
				DateTest that demonstrates class Date’s capabilities.


 */

public class DateTest {
	public static void main(String[] args) {
		Date d1 = new Date();
		d1.initDate();
		d1.displayDate();
		
		System.out.println();
		
		Date d2 = new Date();
		d2.displayDate();
	}
	
}

class Date{
	private int day;
	private int month;
	private int year;
	
	
	
	public void initDate() {
		Calendar c = Calendar.getInstance();
		day = c.get(Calendar.DATE);
		month = c.get(Calendar.MONTH) + 1;
		year = c.get(Calendar.YEAR);
	}
	
	
	public Date() {
		
		this.day = 1;
		this.month = 1;
		this.year = 2003;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	public void displayDate(){
		System.out.printf(" Date : %d/%d/%d ",this.day, this.month , this.year);
	}
}