//06.	Write a program that takes radius of a circle as input. 
//Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.
package basic_program;

import java.util.Scanner;

public class CircumferenceOfCircle {

	static void circumference(double r ,double PI) {
		
		double circumference=2*PI*r;
		System.out.println("The circumference of circle is :=  "+circumference);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radious of circle := ");
		double radious=sc.nextDouble();
		final double PI=3.14;
		
		circumference(radious, PI);
	}

}
