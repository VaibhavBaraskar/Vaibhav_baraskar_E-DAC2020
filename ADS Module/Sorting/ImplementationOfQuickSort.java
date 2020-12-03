package SortingAlgo;

public class ImplementationOfQuickSort {

	static int partition(int [] a,int start,int end) {
		int pivot=a[end];
		
		for(int i=start;i<end;i++) {
			if(a[i]<pivot) {
				int temp=a[start];
				a[start]=a[i];
				a[i]=temp;
				start++;
			}
		}
		
		int temp=a[start];
		a[start]=pivot;
		a[end]=temp;
		return start;
	}
	
	static void quickSort(int[]a,int start,int end) {
		int part=partition( a, start, end);
		if(part-1>start)
			quickSort(a, start, part-1);
		if(part+1<end)
			quickSort(a, part+1, end);
	}
	
	static void display(int[] a) {
		for (int i : a) {
			System.out.print(i+ "  ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

  int a[] = {69,25,5,22,11,55,33,43,88,2};  
		
		display(a);
		System.out.println("\n***********");
		quickSort(a, 0, a.length-1);
		display(a);
	}

}
