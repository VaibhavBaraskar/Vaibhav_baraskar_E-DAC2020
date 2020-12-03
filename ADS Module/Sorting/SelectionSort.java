package SearchingAlgoritham;

public class SelectionSort {
	
	static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	
static	void selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {69,25,5,22,11,55,33,43,88,2};  
		display(arr);
		selectionSort(arr);
		display(arr);
		
	}

}
