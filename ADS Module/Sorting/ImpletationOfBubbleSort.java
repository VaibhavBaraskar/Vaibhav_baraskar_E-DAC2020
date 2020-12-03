package SortingAlgo;

public class ImpletationOfBubbleSort {

	
	void bubbleSort(int[] a) {
		int len=a.length;
		for (int i = 0; i < (len - 1 ); i++) {
			for (int j = 0; j <len-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
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
		// TODO Auto-generated method stub

		ImpletationOfBubbleSort ob=new ImpletationOfBubbleSort();
int a[] = {69,25,5,22,11,55,33,43,88,2};  
		
		ob.display(a);
		System.out.println("\n***********");
		ob.bubbleSort(a);
		ob.display(a);
	}

}
