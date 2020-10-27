//21. Write a Java program to convert a decimal number to octal number.
//Input Data:
//Input a Decimal Number: 15
//Expected Output
//Octal number is: 17 

import java.util.Scanner;
class DecimalToOctal
{
	public static void main(String[] args)
	{
	Scanner n1= new Scanner(System.in);
	System.out.println("Enter a Decimal Number");
	int a= n1.nextInt();
	String num=Integer.toOctalString(a);
	System.out.println("Its Octal Equivalent is : "+num);
	}
}
//E:\Module1\Vaibhav Baraskar>javac DecimalToOctal.java
//E:\Module1\Vaibhav Baraskar>java DecimalToOctal
//Enter a Decimal Number
//10
//Its Octal Equivalent is : 12
