//04.	Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable.
//[Note: primitive down casting is required in this program ] .

package basic_program;

import java.util.Scanner;

public class AdditionOfBytes {
	
	static void addByte(byte b1,byte b2 ) {
		byte b3=(byte)(b1+b2);
		System.out.println("Addition of "+b1+" and "+b2+" is := "+b3);
		
	}

	public static void main(String[] args) {
		
 Scanner sc=new Scanner(System.in);
 
 System.out.print("Enter 1st Byte no := ");
 byte number1=sc.nextByte();
 System.out.print("Enter 2nd Byte no := ");
 byte number2=sc.nextByte();
 
 addByte(number1, number2);
	}

}
