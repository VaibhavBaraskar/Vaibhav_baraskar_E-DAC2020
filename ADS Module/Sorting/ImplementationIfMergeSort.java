package SortingAlgo;

public class ImplementationIfMergeSort {

	static void division(int[] a,int start,int end )
    {
      
        int p;
       
       int mid = (end+start)/2;
        if(a.length<2) 
        {
            return;
        }
        else
        {
            int[] l = new int[mid];
            int[] r = new int[end-mid];
            
            for(p=0;p<mid;p++)
                l[p]=a[p];
            for(int q=0;q<end-mid;q++, p++)
                r[q]=a[p];
            division(l,0,l.length);
            division(r,0,r.length); 
            sortMerge(a, l, r);
        }
    }

  static  void sortMerge(int[] a, int[] l, int[] r)
    {
	 
        int i=0, j=0, k=0;
        while(i<l.length && j<r.length)
            {
                if(l[i]<r[j])
                    {
                        a[k] = l[i]; 
                        i++;
                        k++;
                    }
                else
                    {
                        a[k] = r[j];
                        j++;
                        k++;
                    }
            }

        while(i<l.length)
            {
                a[k] = l[i];
                i++;
                k++;
            }

        while(j<r.length)
            {
                a[k] = r[j];
                j++;
                k++;
            }

    }
  
  static void display(int [] a) {
	  for (int i : a) {
		System.out.print(i+" ");
	}
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {69,25,5,22,11,55,33,43,88,2};  
		
		display(a);
		System.out.println("\n***********");
		division(a, 0, a.length);
		display(a);
	}

}
