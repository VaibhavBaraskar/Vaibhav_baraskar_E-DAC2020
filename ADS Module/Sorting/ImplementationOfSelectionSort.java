package SortingAlgo;

public class ImplementationOfSelectionSort {

	
	void selectionSort(int[] a) {
		int len=a.length;
		for (int i = 0; i < (len - 1); i++) {
			int p=i;
			for (int j = i+1; j < len; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
	}
	
	
	void display(int[] a) {
		for (int i : a) {
			System.out.print(i+ "  ");
		}
	}
	public static void main(String[] args) {
		

		ImplementationOfSelectionSort ob=new ImplementationOfSelectionSort();
		
		int a[] = {69,25,5,22,11,55,33,43,88,2};  
		
		ob.display(a);
		System.out.println("\n***********");
		ob.selectionSort(a);
		ob.display(a);
	}

}
