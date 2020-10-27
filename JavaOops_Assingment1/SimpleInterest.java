//08.	Write a program to find the simple interest. Take the principle amount, rate of interest and time from user 
//using Scanner class.

package basic_program;

import java.util.Scanner;

public class SimpleInterest {

	static void SimpleInterest(double principalAmt, double rateOfInterest, int time ) {
		
		double amount= principalAmt*rateOfInterest*time;
		
		System.out.println("The total amount of Interest := Rs."+amount+"/- only");
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter principal Amount := ");
	long principalAmt=sc.nextLong();
	System.out.print("Enter the rate of interest := ");
	double rateOfInterest=sc.nextDouble();
	System.out.print("Enter the time period in months := ");
	int time=sc.nextInt();
	
	SimpleInterest(principalAmt, rateOfInterest, time);
	
	}

}
