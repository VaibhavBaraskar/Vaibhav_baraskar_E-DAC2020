//23. Write a Java program to convert a binary number to hexadecimal number.
//Input Data:
//Input a Binary Number: 1101
//Expected Output
//HexaDecimal value: D



import java.util.Scanner;
class BinaryToHexadecimal
{
	public static void main(String[] args)
	{
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter a Binary Number");
	String a= obj.nextLine();
	int num=Integer.parseInt(a,2);
	String b=Integer.toHexString(num);
	System.out.println(" Its Hexadecimal Equivalent is :  "+b);
	}
}

//E:\Module1\Vaibhav Baraskar>javac BinaryToHexadecimal.java
//E:\Module1\Vaibhav Baraskar>java BinaryToHexadecimal
//Enter a Binary Number
//1111
// Its Hexadecimal Equivalent is :  f