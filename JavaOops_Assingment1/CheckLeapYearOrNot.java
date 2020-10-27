//14.	Program to check that entered year is a leap year or not.
package basic_program;

import java.util.Scanner;

public class CheckLeapYearOrNot {

	void leapYear(long year) {
		
		if(year%4==0 && year%100 !=0  || year%400==0 ) {
			System.out.println(year+" year is  Leap year ");
		}else {
			System.out.println(year+" year is not a leap year");
		}
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the year ");
		
		long year=sc.nextLong();
		
		CheckLeapYearOrNot obj= new CheckLeapYearOrNot();
		
		obj.leapYear(year);
	}

}
