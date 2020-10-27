//19. Write a Java program to convert a decimal number to binary number.
//Input Data:
//Input a Decimal Number : 5
//Expected Output
//Binary number is: 101
// this code is done upto 15 only


import java.util.Scanner;
class DecimalToBinary{
      public static void main(String args[])
  {
	 Scanner sc = new Scanner(System.in);
        	int input,temp; 
        	
        System.out.print("Enter a Decimal Number : ");
        input= sc.nextInt();
		int quot=0; 
        	quot = input;
		temp=input;
		int bainarynumber[] = new int[5];
	int counter=1;
        while(quot != 0)
        {
            bainarynumber[counter++] = quot%2;
            quot = quot/2;
        }
		
	System.out.print("Entered Decimal number is: "+temp);
        System.out.print("\nBinary number is: ");
	counter-=1;
        for(int i=counter; i>0; i--)
        {
            System.out.print(bainarynumber[i]);
        }
       
    }
}

//output
//E:\Module1\Vaibhav Baraskar>javac DecimalToBinary.java
//E:\Module1\Vaibhav Baraskar>java DecimalToBinary
//Enter a Decimal Number : 15
//Entered Decimal number is: 15
//Binary number is: 1111