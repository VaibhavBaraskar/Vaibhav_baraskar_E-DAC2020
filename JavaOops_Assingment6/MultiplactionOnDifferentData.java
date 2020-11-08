package Assingment6;

import java.util.Scanner;

/*4.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
*/


class MathameticalMultiplyOperations{
	
	void multiply(int num1,int num2) {
		int muliplication=num1*num2;
		System.out.println("1 Method := "+muliplication);
	}
	
	void multiply(float num1,float num2,float num3) {
		float muliplication=num1*num2*num3;
		System.out.println("2 Method := "+muliplication);
	}
	void multiply(int[] arr) {
		int muliplication=1;
		for (int i = 0; i < arr.length; i++) {
			 muliplication=muliplication*arr[i];
		}
		System.out.println("3 Method := "+muliplication);
	}
	
	void multiply(double num1,int num2) {
		double  muliplication=num1*num2;
		System.out.println("4 Method := "+muliplication);
		
	}
}
public class MultiplactionOnDifferentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathameticalMultiplyOperations ob=new MathameticalMultiplyOperations();
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 integer nos :=");
System.out.print("1st no := ");
int num1=sc.nextInt();
System.out.print("2nd no := ");
int num2=sc.nextInt();

ob.multiply(num1, num2);

System.out.println();
System.out.println("Enter 3 floating nos :=");
System.out.print("1st no := ");
float num3=(float)sc.nextFloat();
System.out.print("2nd no := ");
float num4=(float)sc.nextFloat();
System.out.print("3d no := ");
float num5=(float)sc.nextFloat();

ob.multiply(num3, num4, num5);

System.out.println();
System.out.println("Enter size of array:= ");
int size=sc.nextInt();
int[] arr=new int[size];
System.out.println("Enter the array Elements :=");
for (int i = 0; i < arr.length; i++) {
	arr[i]=sc.nextInt();
}

ob.multiply(arr);

System.out.println();
System.out.println("Enter 1st no double and 2nd no int");
System.out.print("1st no := \"");
double num6=sc.nextDouble();
System.out.print("2nd no := ");
int num7=sc.nextInt();
ob.multiply(num6, num7);

	}

}
