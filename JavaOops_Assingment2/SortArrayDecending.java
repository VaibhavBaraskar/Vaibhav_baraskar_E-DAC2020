// 7.	Sort a ten element array in descending order.

package array_Basic;

import java.util.Scanner;

public class SortArrayDecending {

	void sort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	
	System.out.println("\nAfter sort Arry elements are");
for(int k=0;k<arr.length;k++) {
	System.out.print(" "+arr[k]);
}
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :=");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the array elements :=");
	
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Before sort the arry elements are ");
		for(int p=0;p<arr.length;p++) {
			System.out.print(" "+arr[p]);
		}
		
		SortArrayDecending obj=new SortArrayDecending();
		obj.sort(arr);
		
	}

}
