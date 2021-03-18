import java.util.Scanner;
import java.lang.Math;


public class WeekDay {
	
	public static final int MONTHS_OF_YEAR = 12;
	public static final int DAYS_OF_MOST_MONTHS = 31;
	public static final int DAYS_OF_APRIL_JUNE_SEPTEMBER_AND_NOVEMBER = 30;
	public static final int DAYS_OF_LEAP_YEAR_FEBRUARY = 29;
	public static final int DAYS_OF_NORMAL_FEBRUARY = 28;
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println("Please enter a date in DD/MM/YYYY format.");
			
			Scanner userInput = new Scanner(System.in);
			userInput.useDelimiter("/|\r\n");
			
			int day = userInput.nextInt();
			int month = userInput.nextInt();
			int year = userInput.nextInt();
			
			
			
			if (validDate(day, month, year)) {
				
				System.out.println("Your date is valid.");
				System.out.println("This date is " + dayOfTheWeek(day, month, year) + ", the " + day + numberEnding(day) + " of " + monthName(month) + ", " + year + ".");
				
			} else
				System.out.println("Your date is invalid. Must be in DD/MM/YYYY format.");
			
			
			userInput.close();
		
		} catch (java.util.InputMismatchException e) {
			
			System.out.println("That is not a valid date. Must be in DD/MM/YYYY format.");
			
		}
		
		
	}

	public static boolean validDate (int day, int month, int year) {
		
		return (day <= daysInMonth(month, year) && (month <= MONTHS_OF_YEAR) && (month >= 1) && (year >= 0) && (day >= 1) );
		
	}
	
	public static int daysInMonth (int month, int year) {
		switch (month) {
		
		case 4: case 6: case 11:
			return DAYS_OF_APRIL_JUNE_SEPTEMBER_AND_NOVEMBER;
			
		case 2:
			if (isLeapYear(year))
				return DAYS_OF_LEAP_YEAR_FEBRUARY;
			else 
				return DAYS_OF_NORMAL_FEBRUARY;
		default:
			return DAYS_OF_MOST_MONTHS;
		}
		
	}
		
	public static boolean isLeapYear(int year) {
		
		return ((( year % 4 == 0 ) && ( year % 100 != 0 )) || ( year % 400 == 0 ));
	}

	public static String numberEnding(int day) {
		
		switch (day) {
		case 1: case 21: case 31:
			return "st";
		case 2: case 22:
			return "nd";
		case 3: case 23:
			return "rd";
		default:
			return "th";
			
		}
		
	}
		
	public static String monthName(int month) {
		switch (month) {
	
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Error";
		
		}
	}
	
	public static String dayOfTheWeek(int day, int month, int year) {
		
		if (month == 1 || month == 2)
			year -= 1;
		
		int lastTwoDigitsOfYear = year % 100;
		int firstTwoDigitsOfYear = Math.abs(year / 100);
		
		double dayOfWeek = ( day + Math.floor(2.6 * (((month + 9) % 12) + 1) - 0.2) + lastTwoDigitsOfYear + Math.floor( lastTwoDigitsOfYear / 4 ) 
			+ Math.floor(firstTwoDigitsOfYear / 4) - (2 * firstTwoDigitsOfYear) ) % 7;
		
		if (dayOfWeek < 0) 
			dayOfWeek += 7;
		
		switch ( (int)dayOfWeek ) {
		
		case 0: 	// 0 for dayOfWeek is Sunday 
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Error";
		}
				
	}
	
}