package SortingAlgo;

public class ImplementationOfQuickSort2 {

	static void quickSort(int[] a,int start,int end) {
		if(a==null ||a.length==0) return;
		if(start>=end) return;
		
		int mid=start+(end-start)/2;
		
		int pivot=a[mid];
	
	int i=start,j=end;
	while(i<=j) {
		while(a[i]<pivot) {
			i++;
		}
		while(a[j]>pivot) {
			j--;
		}
		
		if(i<=j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			i++;
			j--;
		}
		for (int k : a) {
			System.out.print(k+"  ");
		}
		System.out.println();
		
	}
		if(start<j) {
			quickSort(a,start,j);
		}
		
		if(end>i) {
			quickSort(a,i,end);
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int a[] = {69,25,5,22,11,55,33,43,88,2};  
				
		  for (int i : a) {
			System.out.print(i+" ");
		}
				//display(a);
				System.out.println("\n***********");
				quickSort(a, 0, a.length-1);
				//display(a);
			}
	}


