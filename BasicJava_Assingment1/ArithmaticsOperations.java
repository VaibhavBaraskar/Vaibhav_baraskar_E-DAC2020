//6. Write a Java program to print the sum (addition), multiply, subtract, divide and
//remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//SS125 mod 24 = 5



import java.util.Scanner;
class ArithmaticsOperations{

	public static void main(String... args){
		int num1,num2,multiplaction,addition,subtraction,division,modulo;
		 Scanner sc= new Scanner(System.in);		
			System.out.println("Input first number");
			num1=sc.nextInt();
			System.out.println("Input Second number");
			num2=sc.nextInt();	
	
			addition=num1+num2;
			System.out.println(num1+" + "+num2+" ="+addition);

			subtraction=num1-num2;
			System.out.println(num1+" - "+num2+" ="+subtraction);

			multiplaction=num1*num2;
			System.out.println(num1+" * "+num2+" ="+multiplaction);

			division=num1/num2;
			System.out.println(num1+" / "+num2+" ="+division);

			modulo=num1%num2;
			System.out.println(num1+" % "+num2+" ="+modulo);

	}

}


//output
//E:\Module1\Vaibhav Baraskar>javac ArithmaticsOperations.java
//E:\Module1\Vaibhav Baraskar>java ArithmaticsOperations
//Input first number
//25
//Input Second number
//5
//25 + 5 =30
//25 - 5 =20
//25 * 5 =125
//25 / 5 =5
//25 % 5 =0
