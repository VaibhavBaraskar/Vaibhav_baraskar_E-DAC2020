package SearchingAlgoritham;

public class InsertionSort {

	public static void insertionSort(int[] a) {
		int key, i, j;
		int len = a.length;
		for (i = 1; i < len; i++) {
			key = a[i];
			j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j=j-1;
			}
			a[j + 1] = key;
		}
	}

	
	public static void display(int[] a) {
		for (int n : a) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		int[] in = { 69,25,5,22,11,55,33,43,88,2};
		display(in);
		System.out.println();
		insertionSort(in);
		display(in);
	}
}
