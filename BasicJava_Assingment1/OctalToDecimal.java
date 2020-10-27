//25. Write a Java program to convert a octal number to a decimal number.
//Input Data:
//Input any octal number: 10
//Expected Output
//Equivalent decimal number: 8
import java.util.Scanner;
class OctalToDecimal
{
	public static void main(String[] args)
	{
	Scanner obj= new Scanner(System.in);
	System.out.println("Enter a octal number");
	String a=obj.nextLine();
	int b=Integer.parseInt(a,8);
	System.out.println("decimal number is "+b);
	}
}
//E:\Module1\Vaibhav Baraskar>javac OctalToDecimal.java
//E:\Module1\Vaibhav Baraskar>java OctalToDecimal
//Enter a octal number
//010
//decimal number is 8