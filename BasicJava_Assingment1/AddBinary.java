//17. Write a Java program to add two binary numbers.
//Input Data:
//Input first binary number: 10
//Input second binary number: 11
//Expected Output
//Sum of two binary numbers: 101


import java.util.Scanner;
class AddBinary {
  public static void main(String[] args) 
	{
 
	Scanner sc= new Scanner(System.in);

        int binary1, binary2;
  	int remainder = 0;
	int count = 0;

	  System.out.print("Enter first binary number: ");
	  binary1 = sc.nextInt();
	  System.out.print("Enter second binary number: ");
  	  binary2 = sc.nextInt();
int addition[]= new int[20];
  while (binary1 != 0 || binary2 != 0) 
  {
   addition[count++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
   binary1 = binary1 / 10;
   binary2 = binary2 / 10;
  }
  if (remainder != 0) {
   addition[count++] = remainder;
  }
   count-= 1;
  System.out.print("Adiition of two binary numbers is:  ");

  while (count >= 0) {
   System.out.print(addition[count--]);
  }
   System.out.print("\n");  
 }
}
//output
//E:\Module1\Vaibhav Baraskar>javac AddBinary.java
//E:\Module1\Vaibhav Baraskar>java AddBinary
//Enter first binary number: 1110
//Enter second binary number: 0001
//Adiition of two binary numbers is:  1111

