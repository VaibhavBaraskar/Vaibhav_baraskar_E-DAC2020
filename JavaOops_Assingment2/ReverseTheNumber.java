//2.	Write a program to reverse a given number.
package array_Basic;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter a number :=");
		
		long number=sc.nextLong();
		long a=number;
		String s="";
		while(a>0) {
			long temp=a%10;
			a=a/10;
			s=s+temp;
		}
		
		System.out.println("Reverse of a number is := "+s);
		}

	}


