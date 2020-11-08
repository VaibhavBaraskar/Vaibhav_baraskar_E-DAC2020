package array_Operation;

import java.util.Scanner;

//6. Print the third-largest number in an array without sorting it.
//Input: [ 24,54,31,16,82,45,67]
//Output: 54 (82 and 67 are the largest and second-largest)
public class ThirdLargestNumberOfArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int size=sc.nextInt();
		  int i,large1=0,large2=0,large3=0;
	        int arr[]=new int[size];
	        for (int j = 0; j < arr.length; j++) {
				arr[j]=sc.nextInt();
			}
	        for(i=0;i<size;i++)
	        {
	            if(arr[i]>large1)
	            	large1=arr[i];
	        }
	        
	        for(i=0;i<size;i++)
	        {
	            if(arr[i]>large2 && arr[i]<large1)
	            	large2=arr[i];
	        }
	        
	        for(i=0;i<size;i++)
	        {
	            if(arr[i]>large3 && arr[i]<large2)
	            	large3=arr[i];
	        }
	        //System.out.println(large1);
	       // System.out.println(large2);
	        System.out.println(large3);  
	}

}
