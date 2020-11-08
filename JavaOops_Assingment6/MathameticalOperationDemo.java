package Assingment6;

import java.util.Scanner;

/*3.	Create a class MathOperation that has four static methods. add() method that takes two integer numbers as parameter and returns the
sum of the numbers. subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. multiply() 
method that takes two integer numbers as parameter and returns the product. power() method that takes two integer numbers as parameter and 
returns the power of first number to second number. Create another class Demo (main class) that takes the two numbers from the user and calls 
all four methods of MathOperation class by providing entered numbers and prints the return values of every method.*/
class MathOperation{
	static int sum;
	static int difference;
	static int multiplaction;
	static int power;
	static void add(int num1,int num2) {
		sum=num1+num2;	
	}
	static void subtract(int num1,int num2) {
		difference=num1-num2;	
	}
	static void multiply(int num1,int num2) {
		multiplaction=num1*num2;	
	}
	static void power(int num1,int num2) {
		
		if(num2==0)power=1;
		else{
			power=num1;
		for(int i=1;i<num2;i++) {
			power=power*num1;
		}
	}
}
	
	static void operations(int num1,int num2) {
		add(num1, num2);
		subtract(num1, num2);
		multiply(num1, num2);
		power(num1, num2);
		
		System.out.println("Addition      := "+sum);
		System.out.println("Subtraction   := "+difference);
		System.out.println("Multiplaction := "+multiplaction);
		System.out.println("Power         := "+power);
		
	}
	
}

public class MathameticalOperationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st number := ");
		int n1=sc.nextInt();
		System.out.print("Enter the 2nd number := ");
		int n2=sc.nextInt();
		
		MathOperation.operations(n1, n2);
		
		
		
	}

}
