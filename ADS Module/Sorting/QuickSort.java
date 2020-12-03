package SearchingAlgoritham;

public class QuickSort {

		public static int partition(int arr[], int lo, int hi) {
			int p=arr[hi];
			int i=lo-1;
			for(int j=lo;j<=hi-1;j++) {
				if(arr[j]<=p) {
					i++;
					arr[j]=arr[i]+arr[j]-(arr[i]=arr[j]); 
				}
			}
			arr[hi]=arr[i+1]+arr[hi]-(arr[i+1]=arr[hi]);  
			return (i+1);
		}
		
		
		public static void display(int[] a) {
			for (int n : a) {
				System.out.print(n + " ");
			}
		}
		
		
		public static void quickSort(int[] a,int low , int high) {
			if(low<high) {
				int pivot=partition(a,low,high);
				quickSort(a,low,pivot-1);
				quickSort(a,pivot,high);
			}			
		}
		
		public static void main(String[] args) {
			int arr[] = {69,25,5,22,11,55,33,43,88,2};  
			int low=0,high=arr.length-1;
			
			display(arr);
			System.out.println();
			quickSort(arr, low, high);
			display(arr);
			
	
		}
	
}
