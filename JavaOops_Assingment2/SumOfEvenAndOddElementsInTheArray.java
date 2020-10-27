//10.	Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.

package array_Basic;

import java.util.Scanner;

public class SumOfEvenAndOddElementsInTheArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many number of elements do you want to insert := ");
		int size=sc.nextInt();
		int[] a=new int[size];
		int sumEven=0;
		int sumOdd=0;
		System.out.print("Enter the array elements := ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length;j++) {
		if(a[j]%2==0)
				sumEven=sumEven+a[j];
			else
				sumOdd=sumOdd+a[j];
		}
		System.out.println("Sum of even values of array is:= "+sumEven);
		System.out.println("Sum of odd values of array is:= "+sumOdd);

	}

}
