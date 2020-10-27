//5.	Print all prime numbers between two given numbers. [ break continue ]
package array_Basic;

import java.util.Scanner;

public class PrimeNoBetweenTwoNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers to find prime numbers between two numbers  : ");
		int n = sc.nextInt();
		int n1= sc.nextInt();
		System.out.println("The prime number1s are :=");
		for(int i=n;i<=n1;i++)
		{
			if(i%2==0 || i%3==0|| i%5==0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
