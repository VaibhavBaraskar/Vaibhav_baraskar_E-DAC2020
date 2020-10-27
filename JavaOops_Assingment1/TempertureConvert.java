//10.	Write a program to convert temperature from Fahrenheit to Celsius.
//Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]

package basic_program;

import java.util.Scanner;

public class TempertureConvert {

	
	static void celsiusToFahrenheit(double temp) {
		
		 double fahrenheit= (((temp)*(9/5))+32);
		System.out.println(temp+"'C  Equivalent to Fahernheit is := "+fahrenheit+"'F");
	}
	
	static void fahrenheitToCelsius(double temp) {
		
		double celsius=((temp-32)*(5/9));
		System.out.println(temp+"'F  Equivalent to Celsius is := "+celsius+"'C");
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose Input type of Temperature : 1.Celsius 2.Fahrenheit");
		int input=sc.nextInt();
		
		if(input==1) {
			
			System.out.print("\nInsert temperature in Celsius := ");
			double temp=sc.nextDouble();
			
			celsiusToFahrenheit(temp);
		}else if(input==2) {
			System.out.print("\nInsert temperature in Fahrenheit := ");
			double temp=sc.nextDouble();
			
			fahrenheitToCelsius(temp);
		}else {
			System.out.println("You have Entered wrong choice !!!!!!....");
		}

	}

}
