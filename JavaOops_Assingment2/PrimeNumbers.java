//3.	Program to check whether number is prime or not.

package array_Basic;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a number to check is it primre or not :=");
		
		long num=sc.nextLong();
		
		int count=1;
		
		for(int i=2;i<=num;i++) {
			
			if((num%i)==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("Enter number "+num+" is prime");
		}else {
			System.out.println("Enter number "+num+" is not a prime");
		}
	}

}
