//5. Write a Java program that takes two numbers as input and display the product of
//two numbers.
//Test Data:
//Input first number: 25
//Input second number: 5
//Expected Output :
//25 x 5 = 125


import java.util.Scanner;
class InputMultiplication{

	public static void main(String[] args){
		int num1,num2,multiplaction;
		 Scanner sc= new Scanner(System.in);		
			System.out.println("Input first number");
			num1=sc.nextInt();
			System.out.println("Input Second number");
			num2=sc.nextInt();	
		multiplaction=num1*num2;
			System.out.println(num1+" * "+num2+" ="+multiplaction);

	}

}

//output
//E:\Module1\Vaibhav Baraskar>javac InputMultiplication.java
//E:\Module1\Vaibhav Baraskar>java InputMultiplication
//Input first number
//100
//Input Second number
//10
//100 * 10 =1000