/*
 * Print number of days in particular month and year
 */
import java.util.Scanner;


/**
 * @version 0.0
 * @author minh
 */
public class NumberDay {
	// Create a class contain all month names 
	enum Month {

		JAN("January", "Jan.", "Jan", "1"), FEB("February", "Feb.", "Feb", "2"), MAR("March", "Mar.", "Mar", "3"),
		APR("April", "Apr.", "Apr", "4"), MAY("May", "5"), JUN("June", "Jun", "6"),
		JUL("July", "Jun", "7"), AUG("August", "Aug.", "Aug", "8"), SEP("September", "Sept.", "Sep", "9"),
		OCT("October", "Oct.", "Oct", "10"), NOV("November", "Nov.", "Nov", "11"), DEC("Deccember", "Dec.", "Dec", "12");

		private String[] nameMonths;  // List of month name

		// getter method
		public String[] getNameMonth() {
			return this.nameMonths;
		}

		// enum constructor
		private Month(String ... nameMonths) {
			this.nameMonths = nameMonths;
		}
	}

	private Month month;
	private int year;

	// Contructor
	private NumberDay(String monthStr, String yearStr) {
		// check month valid
		boolean is_month_valid = false;
		for (Month monthObj: Month.values()) {
			for (String name: monthObj.getNameMonth()) {
				if (monthStr.equals(name)) {
					is_month_valid = true;
					this.month = monthObj;
					break;
				}
			}
			// already valid
			if (is_month_valid) {
				break;
			}
		}
		// If month is not valid -> raise error
		if (!is_month_valid) {
			System.out.println("The month is not valid form, enter again?");
			System.exit(-1);
		}

		// check if year valid
		int year = 0;
		try {
			year = Integer.parseInt(yearStr);
		} catch (Exception e) {
			System.out.println("Year must be an integer!");
			System.out.println("Error: " + e.toString());
		}
		if (year < 0) {
			System.out.println("year is non-negative number!");
			System.exit(-1);
		}

		this.year = year;
		System.out.println(year);
	}

	// get month name
	public String getMonthName() {
		return this.month.nameMonths[0];
	}

	// get year
	public String getYear() {
		return String.valueOf(this.year);
	}

	// check leap year
	public static boolean checkLeapYear(int year) {
		boolean isLeapYear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				isLeapYear = year % 400 == 0 ? true : false;
			}
			else
				isLeapYear = true;
		}
		else
			isLeapYear = false;
		return isLeapYear;
	}

	// get number of day in month
	public int getNumberDay() {
		int numberDay = 0;
		switch (this.month) {
			case JAN:
				numberDay = 31;
				break;
			case FEB:
				numberDay = this.checkLeapYear(this.year) ? 29 : 28;
				break;
			case MAR:
				numberDay = 31;
				break;
			case APR:
				numberDay = 30;
				break;
			case MAY:
				numberDay = 31;
				break;
			case JUN:
				numberDay = 30;
				break;
			case JUL:
				numberDay = 31;
				break;
			case AUG:
				numberDay = 31;
				break;
			case SEP:
				numberDay = 30;
				break;
			case OCT:
				numberDay = 31;
				break;
			case NOV:
				numberDay = 30;
				break;
			case DEC:
				numberDay = 31;
				break;
			default:
				System.out.println("Wrong syntax for month!");
		}
		return numberDay;
	}

	public static void main(String[] args) {
		// check syntax
		if (args.length != 2) {
			System.out.println("Must pass month and year! As: [Name_program] [month] [year]");
			System.exit(-1);
		}

		NumberDay numberDay = new NumberDay(args[0], args[1]);
		System.out.println(numberDay.getMonthName() + " in " + numberDay.getYear() + " has " + numberDay.getNumberDay());
	}
}