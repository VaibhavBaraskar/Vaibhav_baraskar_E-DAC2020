package array_Operation;
//2. Write a program which takes an array of integers and prints the running average of
//3 consecutive integers. In case the array has fewer than 3 integers, there should be no output.
//Input: [5,14,35,89,140]
//Output: [18, 46, 88]
//(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)

import java.util.Scanner;

public class AverageOf3ConsecutiveIndexsOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array  :  ");
		int size=sc.nextInt();
		int i,j,sum=0,avg=0;
        int arr[]=new int[size];
             
        for (int k = 0; k < arr.length; k++) {
			arr[k]=sc.nextInt();
		}
        
        for(i=0;i<size-2;i++)
        {
               avg=((arr[i]+arr[i+1]+arr[i+2])/3);
                System.out.print(avg);
                if(i<(size/3)+1)System.out.print(", ");
                else if(i==(size/3)+1)System.out.print(".");
            
        }
        System.out.println();
	}

}
