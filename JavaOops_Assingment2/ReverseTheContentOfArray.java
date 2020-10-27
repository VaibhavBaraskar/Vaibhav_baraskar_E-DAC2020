//8.	Write a program to reverse the array elements.

package array_Basic;

import java.util.Scanner;

public class ReverseTheContentOfArray {

	void reverse(int[] arr) {
		int temp=0;
		int[] p=new int[arr.length];
		p=arr;
		for(int i=0;i<arr.length/2;i++) {
		 temp=p[i];
		 p[i]=p[arr.length-i-1];
		 p[arr.length-i-1]=temp;
		}
		System.out.println("\nAfter the Reversing arry elements are := ");
		for(int q=0;q<arr.length;q++) {
			System.out.print(" "+p[q]);
		}
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of array elements");
		
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the elements ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before  reverse array elements are :=");
for(int n=0;n<arr.length;n++) {
	System.out.print(" "+arr[n]);
}

ReverseTheContentOfArray obj=new ReverseTheContentOfArray();
obj.reverse(arr);
	
	}

}
