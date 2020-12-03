package SearchingAlgoritham;

public class BubbleSort {

	
	static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	
static	void bubbleSort(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 0; j < (arr.length-i-1); j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {69,25,5,22,11,55,33,43,88,2};  
		display(arr);
		bubbleSort(arr);
		display(arr);
	}

}
