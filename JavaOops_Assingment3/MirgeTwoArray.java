package array_Operation;

import java.util.Scanner;

//1. Write a program to merge two arrays of integers by reading one number at a time from
//each array until one of the array is exhausted, and then concatenating the remaining numbers.
//Input: [23,60,94,3,102] and [42,16,74]
//Output: [23,42,60,16,94,74,3,102]

public class MirgeTwoArray {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size of 1st Array : ");
		int n=sc.nextInt();
		int arr[]= new int[n];
		
		System.out.println("Enter size of 2nd Array : ");
		int n1=sc.nextInt();
		int arr1[]= new int[n1];
		
		
		
		System.out.println("Enter 1st Array Element");
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter 2nd Array Element");
		for(int i=0;i<n1;i++)
		{
			arr1[i]= sc.nextInt();
		}
		
		
		int n3=n+n1;
		int arr3[]= new int[n3];
		
		     
		int count=0,	num=0;
		while(num <n3)
		{					//n1=4     n2=6			n3=10   num=2    count=1
			if(count<n)   // arr1[1]   arr2[0]      arr3[2]
			{
			arr3[num]=arr[count];
			num++;
			}
			
			if(count<n1)
			{
			arr3[num]=arr1[count];
			num++;
			}
			count++;
		}
		
		for(int i=0;i<n3;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

}
