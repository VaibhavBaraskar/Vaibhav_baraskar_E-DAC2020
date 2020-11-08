package array_Operation;
//3. Write a program which generates the series 1,4,27,16,125,36.
import java.util.Scanner;

public class SreiesOfSquareAndCubeAlternate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the N term of Series : ");
		int n=sc.nextInt();
	
         
	        for(int i=1;i<=n;i++)
	        {
	            if(i%2==0)
	            {    System.out.print(i*i);
	            if(i<n){System.out.print(", ");}
                else if(i==n)System.out.print(".");
	            
	            }  else
	                {System.out.print(i*i*i);
	                if(i<n){System.out.print(", ");}
	                else if(i==n)System.out.print(".");
	                }
	        }
	        System.out.println();
	}

}
