//24. Write a Java program to convert a binary number to a Octal number.
//Input Data:
//Input a Binary Number: 111
//Expected Output
//Octal number: 7 
//import java.util.Scanner;
class BinaryToOctal
{
	public static void main(String[] args)
	{
	Scanner objv= new Scanner(System.in);
	System.out.println("Enter a Binary Number");
	String a= objv.nextLine();
	int num= Integer.parseInt(a,2);
	String an=Integer.toOctalString(num);
	System.out.println(" Its Octal Represition  is :"+an);
}
}

//E:\Module1\Vaibhav Baraskar>javac BinaryToOctal.java
//E:\Module1\Vaibhav Baraskar>java BinaryToOctal
//Enter a Binary Number
//111
//Its Octal Represition  is :7