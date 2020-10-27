//09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
//Now convert the entered days into complete years, months and days and print them.

package basic_program;

import java.util.Scanner;

public class ConvertDaysToYearMonthDay {

	void yearMonthDay(int noOfDays) {
		int year = noOfDays / 365;
	        noOfDays = noOfDays % 365;
	        System.out.println("No. of years:"+year);
	     int   week = noOfDays / 7;
	        noOfDays = noOfDays % 7;
	        System.out.println("No. of weeks:"+week);
	      int  day = noOfDays;
	        System.out.println("No. of days:"+day);
	}
	
	public static void main(String[] args) {
	
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
       int  noOfDays = s.nextInt();
       
       ConvertDaysToYearMonthDay obj =new ConvertDaysToYearMonthDay();
       obj.yearMonthDay(noOfDays);
	}

}
