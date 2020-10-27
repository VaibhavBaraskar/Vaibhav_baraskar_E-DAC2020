//20. Write a Java program to convert a decimal number to hexadecimal number.
//Input Data:
//Input a decimal number: 15
//Expected Output
//Hexadecimal number is : F 

import java.util.Scanner;
class DecimalToHexadecimal
{
	public static void main(String[] args)
	{
	Scanner man= new Scanner(System.in);
	System.out.println("Enter a Decimal Number");
	int a= man.nextInt();
	String b=Integer.toHexString(a);
	System.out.println(" Its Hexadecimal Equivalent is : "+b);
	}
}
//output
//E:\Module1\Vaibhav Baraskar>javac DecimalToHexadecimal.java
//E:\Module1\Vaibhav Baraskar>java DecimalToHexadecimal
//Enter a Decimal Number
//15
// Its Hexadecimal Equivalent is : f