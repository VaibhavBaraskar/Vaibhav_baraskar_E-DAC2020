//9.	Write a program to search an element in the array.
package array_Basic;

import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("How many number of elements do you want to insert := ");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.print("Enter the array elements := ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Enter the value that to be searchedin array :=");
		int key=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				count++;
				System.out.println("Element Found");
			}
			
		}
		
		if(count==0) {
			System.out.println("Element not found");
		}	
	}

}
