//4.	Calculate  series : 12+22+32+42+.........+n2
package array_Basic;

import java.util.Scanner;

public class SumOfSquareOfNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		long sum=0;
		
		System.out.print("Enter the \'N\' term of series :=");
		
		long nterm=sc.nextLong();
		
		for(int i=1;i<=nterm;i++) {
			
			sum=sum+(i*i);
		}
		System.out.println("Sum of a series is := "+sum);
		

	}

}
