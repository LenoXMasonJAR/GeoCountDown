package project1;

import java.lang.Integer;
import java.io.*;
import java.util.*;

/************************************************************************************
 * This class is a GeoCountDownTimer that simulates dates in the future and tests the
 * validity of the date and whether or not if it is a leap year.
 * 
 * @author Mason Mahoney
 *@version 9/14/2016
 ************************************************************************************/
public class GeoCountDownTimer {
	/** This is the number of years for a given date */
	private int year;

	/** This is the number of months for a given date */
	private int month;

	/** This is the number of days for a given date */
	private int day;

	/** Array for the names of all of the months */
	private static final String[] MONTHS = { "", "January", "February", "March", "April", "May", "June", "July",
			"August", "September", "October", "November", "December" };

	/** This is the number of days in a month respectively */
	static final int[] DAYS_IN_A_MONTH = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	/** List of days in the year thus far */
	private static final int[] daysThusFar = { 0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };

	/** Number of days in a year */
	private final int DAYS_IN_A_YEAR = 365;

	/** Numbers of days in a leap year */
	private final int DAYS_IN_A_LEAP_YEAR = 366;

	/******************************************************
	 * Constructor that sets the instance variables to zero
	 *
	 *******************************************************/
	private GeoCountDownTimer() {
		year = 0;
		month = 0;
		day = 0;

	}

	/**************************************************************************
	 * Constructor that has parameters that assigns "this" year/day/month equal
	 * to the year, month, and day parameters.
	 * 
	 * @param month the number of months to be assigned
	 * @param day the number of days to be assigned
	 * @param year the number of years to be assigned
	 * 
	 * @throws IllegalArgumentException when the date is out of range
	 ***************************************************************************/
	public GeoCountDownTimer(int month, int day, int year) {
		if (!isValidDate(month, day, year))
			throw new IllegalArgumentException();

		this.year = year;
		this.month = month;
		this.day = day;

	}

	/**********************************************************************
	 * Constructor that initializes the other GeoCountDownTimer parameter
	 * 
	 * @param other is the other GeoCountDownTimer
	 * @throws IllegalArgumentException when the date is out of range
	 **********************************************************************/
	public void GeoCountDownTimer(GeoCountDownTimer other) {
		if (!isValidDate(month, day, year))
			throw new IllegalArgumentException();
		this.year = other.year;
		this.month = other.month;
		this.day = other.day;

	}

	/***************************************************************************
	 * Constructor that has a string parameter of geoDate and it takes that
	 * string, puts it into an array and splits up the month, day, and year. It
	 * then takes the string and splits it up into an actual date if the length
	 * of the array element is 3 and if it is not then it throws an
	 * IllegalArgumentException.
	 * 
	 * @param geoDate is the date to be split up
	 * @throws IllegalArgumentException when the date is out of range
	 ***************************************************************************/

	public GeoCountDownTimer(String geoDate) {
		String[] s = geoDate.split("/");

		if (s.length == 3) {
			if (!isValidDate(Integer.parseInt(s[0].trim()), 
					Integer.parseInt(s[1].trim()), 
					Integer.parseInt(s[2].trim())))
				throw new IllegalArgumentException();
			this.month = Integer.parseInt(s[0].trim());
			this.day = Integer.parseInt(s[1].trim());
			this.year = Integer.parseInt(s[2].trim());
		} else {
			throw new IllegalArgumentException();
		}

	}

	/***************************************************************************
	 * This method checks to see if the geo timer equals equals the day, month,
	 * and year of "this" day month and year.
	 * 
	 * @param other the other object being assigned
	 * @return true or false
	 * @throws IllegalArgumentException when invalid object
	 ***************************************************************************/
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}

		if (other instanceof GeoCountDownTimer) {
			GeoCountDownTimer g = (GeoCountDownTimer) other;

			if ((this.year == g.year) && (this.month == g.month) && (this.day == g.day))
				return true;
			else
				return false;
		}

		throw new IllegalArgumentException();

	}

	/****************************************************************************
	 * The compareTo method checks to see if the parameter other is less than or
	 * greater than each day, month, and year, respectively. If its less than 1
	 * is returned if it's greater than -1 is returned. If it is equal then 0 is
	 * returned
	 * 
	 * @param other is a geoCountDownTimer to be assigned to other
	 * @return 1, -1, or 0
	 *****************************************************************************/

	public int compareTo(GeoCountDownTimer other) {
		if (year > other.year)
			return 1;
		else if (year < other.year)
			return -1;
		if (month > other.month)
			return 1;
		else if (month < other.month)
			return -1;
		if (day > other.day)
			return 1;
		else if (day < other.day)
			return -1;

		return 0;

	}

	/****************************************************************************
	 * This is a method that checks to see if the month, day, and year parameter
	 * input is a valid date.
	 * 
	 * @param month is an int assigned to month
	 * @param day is an int assigned to month
	 * @param year is int assigned to month
	 * @return true or false
	 *****************************************************************************/
	private boolean isValidDate(int month, int day, int year) {
		if (year >= 2014)
			if ((month <= 12 && month >= 1) && month != 2)
				if (day <= DAYS_IN_A_MONTH[month] && day > 0)
					return true;
				else
					return false;
		if (year >= 2014)
			if (isLeapYear(year) && month == 2) {
				if (day <= 29 && day > 0)
					return true;
				else
					return false;
			}

		if (year >= 2014)
			if (!isLeapYear(year) && month == 2) {
				if (day <= 28 && day > 0)
					return true;
				else
					return false;
			}

		return false;

	}

	/****************************************************************************
	 * This method takes in a year as a parameter and checks to see if that year
	 * is a leap year.
	 * 
	 * @param year contains years used in method
	 * 
	 * @return true or false
	 *****************************************************************************/

	private boolean isLeapYear(int year) {
		if (year % 4 != 0) {
			return false;
		} else if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else {
			return true;
		}

	}

	/****************************************************************************
	 * This method takes a parameter that decrements the number of days based on
	 * the parameter input
	 * 
	 * @param days contains days used in method
	 * @throws IllegalArgumentException when the days are 0 or less
	 ****************************************************************************/
	public void dec(int days) {
		if (days <= 0) {
			throw new IllegalArgumentException();
		}
		while (days > 0) {
			day -= 1;
			if (this.day == 0) {
				month -= 1;
				if (month == 0) {
					month = 12;
					year -= 1;
				}
				if (month != 2)
					this.day = DAYS_IN_A_MONTH[month];
				else if (isLeapYear(year))
					this.day = 29;
				else if (!isLeapYear(year))
					this.day = DAYS_IN_A_MONTH[month];
			}
			days--;
		}

	}

	/***************************************
	 * calls the decrement method
	 ***************************************/
	public void dec() {
		dec(1);
	}

	/****************************************************************************
	 * This method takes a parameter that increments the number of days based on
	 * the parameter input
	 * 
	 * @param days contains the days used in method
	 * @throws IllegalArgumentException when the days are 0 or less
	 ****************************************************************************/
	public void inc(int days) {
		if (days <= 0) {
			throw new IllegalArgumentException();
		}
		while (days > 0) {
			day++;
			if (day > DAYS_IN_A_MONTH[month]) {
				if (month != 2) {
					month++;
					day = 1;
				}
				if ((isLeapYear(year) && day == 30) || (!isLeapYear(year) && day == 29)) {
					month = month + 1;
					day = 1;
				}
			}
			if (month == 13) {
				year++;
				month = 1;
				day = 1;
			}

			days--;
		}
	}

	/***************************************
	 * calls the increment method
	 ***************************************/
	public void inc() {
		inc(1);
	}

	/*********************************************
	 * @return s, which is the string of the date
	 *********************************************/
	public String toString() {
		String s = MONTHS[this.month] + " " + this.day + ", " + this.year;
		return s;
	}

	/******************************************
	 * @return the date separated by "/" marks
	 ******************************************/
	public String toDateString() {
		return this.month + "/" + this.day + "/" + this.year;
	}

	/***************************************
	 * @return year which is current year
	 ***************************************/
	public int getYear() {
		return year;
	}

	/***************************************
	 * sets the instance variable year
	 * 
	 * @param year which is current year
	 ***************************************/
	public void setYear(int year) {
		this.year = year;
	}

	/***************************************
	 * @return month which is current month
	 ***************************************/
	public int getMonth() {
		return month;
	}

	/***************************************
	 * sets the instance variable month
	 * 
	 * @param month which is current month
	 ***************************************/
	public void setMonth(int month) {
		this.month = month;
	}

	/***************************************
	 * @return day which is current day
	 ***************************************/
	public int getDay() {
		return day;
	}

	/***************************************
	 * sets the instance variable day
	 * 
	 * @param day which is current day
	 ***************************************/
	public void setDay(int day) {
		this.day = day;
	}

	/***********************************************
	 * Saves file on program
	 * 
	 * @param fileName name of file being saved
	 ***********************************************/
	public void save(String fileName) {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter("fileName")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		out.println(day);
		out.println(month);
		out.println(year);
		out.close();

	}

	/************************************************
	 * loads file into program
	 * 
	 * @param fileName name of file being loaded
	 ************************************************/
	public void load(String fileName) {
		try {
			// open the data file
			Scanner fileReader = new Scanner(new File("fileName"));

			// read one String in of data and an int
			this.day = fileReader.nextInt();
			this.month = fileReader.nextInt();
			this.year = fileReader.nextInt();
			fileReader.close();

		}

		// could not find file
		catch (Exception error) {
			System.out.println("File not found ");
		}
	}

	/**************************************************************************
	 * returns the number of days from the fromDate and uses the helper method
	 * toDays to do so.
	 * 
	 * @param fromDate is days used in method
	 * @return days from current date
	 * @throws IllegalArgumentException when the date is invalid
	 **************************************************************************/
	public int daysToGo(String fromDate) {
		String[] geo = fromDate.split("/");
		if (!isValidDate((Integer.parseInt(geo[0])), 
				Integer.parseInt(geo[1]), 
				Integer.parseInt(geo[2])))
			throw new IllegalArgumentException();
		GeoCountDownTimer g = new GeoCountDownTimer
				(Integer.parseInt(geo[0]), 
				Integer.parseInt(geo[1]),
				Integer.parseInt(geo[2]));

		if (toDays(g) > toDays(this))
			throw new IllegalArgumentException();

		return toDays(this) - toDays(g);

	}

	/***************************************************
	 * returns number of days from current to geo date
	 * 
	 * @param geo which is the GeoCountDownTimer object
	 * @return number of days to geoDays
	 ****************************************************/
	protected int toDays(GeoCountDownTimer geo) {
		int leapYear = this.year / 4;
		int otherLeapYear = geo.year / 4;

		int currentDays = this.day + daysThusFar[this.month]
				+ (((this.year - leapYear) * DAYS_IN_A_YEAR) + (leapYear * DAYS_IN_A_LEAP_YEAR));

		int geoDays = geo.day + daysThusFar[geo.month]
				+ (((geo.year - otherLeapYear) * DAYS_IN_A_YEAR) + (otherLeapYear * DAYS_IN_A_LEAP_YEAR));

		int solution = geoDays - currentDays;

		return solution;
	}

	/**************************************************
	 * This is the main method which tests this class.
	 * 
	 * 
	 **************************************************/
	public static void main(String[] args) {
		GeoCountDownTimer s = new GeoCountDownTimer("2/10/2018");
		System.out.println("Date: " + s);

		GeoCountDownTimer s1 = new GeoCountDownTimer(2, 20, 2015);
		System.out.println("Date: " + s1.toDateString());

		s1.inc(365);
		System.out.println("Date: " + s1);

		GeoCountDownTimer s2 = new GeoCountDownTimer(4, 10, 2016);
		for (int i = 0; i < (366 + 365 + 365 + 365); i++)
			s2.inc();
		System.out.println("Date: " + s2);
		
		
		GeoCountDownTimer p = new GeoCountDownTimer("6/10/2045");
		System.out.println("Date: " + p);

		GeoCountDownTimer s3 = new GeoCountDownTimer(8, 20, 2019);
		System.out.println("Date: " + s3.toDateString());

		s3.dec(365);
		System.out.println("Date: " + s3);

		GeoCountDownTimer s4 = new GeoCountDownTimer(5, 15, 3000);
		for (int i = 0; i < (366 + 365 + 365 + 365); i++)
			s4.dec();
		System.out.println("Date: " + s4);

		
	}

}
