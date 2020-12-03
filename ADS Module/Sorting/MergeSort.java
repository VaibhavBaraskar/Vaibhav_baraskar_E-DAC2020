package SearchingAlgoritham;

public class MergeSort {

	public static void merge(int[] a, int low, int m, int up) {
		int len1 = m - low + 1;
		int len2 = up - m;
		int[] left = new int[len1];
		int[] right = new int[len2];
		for (int i = 0; i < len1; i++)
			left[i] = a[low + i];
		for (int j = 0; j < len2; j++)
			right[j] = a[m + 1 + j];

		int i = 0, j = 0, k = low;
		while (i < len1 && j < len2) {
			if (left[i] <= right[j])
				a[k] = left[i++];
			else
				a[k] = right[j++];
			k++;
		}
		while (i < len1)
			a[k++] = left[i++];
		while (j < len2)
			a[k++] = right[j++];
	}
	
	
	public static void mergeSort(int[] a, int lower, int upper) {
		if (lower < upper) {
			int mid = (lower + upper) / 2;
			mergeSort(a, lower, mid);
			mergeSort(a, mid + 1, upper);
			merge(a, lower, mid, upper);
		}
	}
	
	
	static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {69,25,5,22,11,55,33,43,88,2};  
		display(arr);
		mergeSort(arr, 0, arr.length-1);
		display(arr);
	}

}
