package BasicsPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	int fibonacci(int n) {return (n==0||n==1)? n:fibonacci(n-1)+fibonacci(n-2);}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries ob=new FibonacciSeries();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no up to wich you wont to print Series := ");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
		System.out.println(ob.fibonacci(i));
		}
		}

}
