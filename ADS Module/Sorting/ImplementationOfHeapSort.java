package SortingAlgo;

public class ImplementationOfHeapSort {

	
	 static void heapSort(int a[])
	    {
	      
	        for (int i =  a.length/ 2 - 1; i >= 0; i--){
	            heapify(a, a.length, i);
	        }
	        for (int i = a.length - 1; i>=0; i--)
	        {
	            int temp = a[0];
	            a[0] = a[i];
	            a[i] = temp;
	            
	            heapify(a, i, 0);
	        }
	    }
	    
	   static void heapify(int arr[], int len, int root)
	    {
	        
	        int leftIndex = 2*root + 1;  // left = 2*i + 1
	        int rightIndex = 2*root + 2;  // right = 2*i + 2
	      
	        int largest = root;
	      
	        if (leftIndex < len && arr[leftIndex] > arr[largest])
	            largest = leftIndex;
	        
	        if (rightIndex < len && arr[rightIndex] > arr[largest])
	            largest = rightIndex;
	       
	        if (largest != root)
	        {
	            
	            int swap = arr[root];
	            arr[root] = arr[largest];
	            arr[largest] = swap;
	           
	            heapify(arr, len, largest);
	        }
	    }
	
	 static void display(int[] a) {
		 for (int i : a) {
			System.out.print(i+" ");
		}
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {69,25,5,22,11,55,33,43,88,2};  
		
		display(a);
		System.out.println("\n***********");
		heapSort(a);
		display(a);
	}

}
