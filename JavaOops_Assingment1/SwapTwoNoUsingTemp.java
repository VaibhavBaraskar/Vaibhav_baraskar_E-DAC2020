//11.	Write a program to swap two numbers without using third variable.
package basic_program;

import java.util.Scanner;

public class SwapTwoNoUsingTemp {

	static void swap(long fnum,long snum) {
		
		System.out.println("Before swap "+fnum+" , "+snum);
		long a,b;
		a=fnum;
		b=snum;
		
		long temp=0;
		temp=a;
		b = fnum;
		a = snum;
		
		System.out.println("After swap "+a+" , "+b);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number:= ");
		long fnum=sc.nextLong();
		System.out.print("Enter 2nd number:= ");
		long snum=sc.nextLong();
		
		swap(fnum, snum);

	}

}
