//6.	Program to show sum and average of 10 element array. Accept array elements from user. 

package array_Basic;

import java.util.Scanner;

public class AverageOfElements {

	int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("The sum of all values is :="+sum);
	return sum;
	}
	void average(int sum, int length) {
		double d=sum/length;
		System.out.println("The Average is:= "+d);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements of an array :=");
		
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("enter the values in array := ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		AverageOfElements obj=new AverageOfElements();
		
		int sum=obj.sum(arr);
		obj.average(sum, arr.length);
		
	}

}
