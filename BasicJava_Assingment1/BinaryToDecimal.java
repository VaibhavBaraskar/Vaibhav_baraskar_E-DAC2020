//22. Write a Java program to convert a binary number to decimal number.
//Input Data:
//Input a binary number: 100
//Expected Output
//Decimal Number: 4 

import java.util.Scanner;
class BinaryToDecimal
{
	public static void main (String[] args)
{
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter a Binary Number");
	String b= obj.nextLine();
	int a=Integer.parseInt(b,2);
	System.out.println(" Its Decimal Equivalent is : "+a);
}
}
//E:\Module1\Vaibhav Baraskar>javac BinaryToDecimal.java
//E:\Module1\Vaibhav Baraskar>java BinaryToDecimal
//Enter a Binary Number
//0100
// Its Decimal Equivalent is : 4