package SortingAlgo;

public class ImplementationOfInsertionSort {

	void insertionSort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			int j=0;
	
			for ( j = i-1; j >=0 && a[j]>temp; j--) {
				a[j+1]=a[j];
				
			}
			a[j+1]=temp;
			for (int k : a) {
				System.out.print(k+ "  ");
			}
			System.out.println();
		}
		
	}
	
	void display(int[] a) {
		for (int i : a) {
			System.out.print(i+ "  ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationOfInsertionSort ob=new ImplementationOfInsertionSort();
		
int a[] = {69,25,5,22,11,55,33,43,88,2};  
		
		ob.display(a);
		System.out.println("\n***********");
		ob.insertionSort(a);
		ob.display(a);
		
		int[] l=new int[0];
		l[0]='i';
		System.out.println(l);
		
	}

}
