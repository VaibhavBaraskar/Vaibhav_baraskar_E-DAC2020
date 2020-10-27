//1	Write a program to print table of any entered number using loop.
package array_Basic;

import java.util.Scanner;

public class TableOfaNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number  whose table is to be required := ");
		int num=sc.nextInt();
		
		System.out.println("------Table of a number------");
		for(int i=1;i<11;i++) {
			System.out.println(num+" * "+i+" := "+(num*i));
		}
		
	}

}
