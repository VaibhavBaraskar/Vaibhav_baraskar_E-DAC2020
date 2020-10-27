//12. Write a Java program that takes three numbers as input to calculate and print the
//average of the numbers. 


import java.util.Scanner;
class AverageOfThreeNumbers{

	public static void main(String[] args){
		int num1,num2,num3,avg;
		 Scanner sc= new Scanner(System.in);		
			System.out.println("Input 1st number");
			num1=sc.nextInt();
			System.out.println("Input 2nd number");
			num2=sc.nextInt();
			System.out.println("Input 3rd number");
			num3=sc.nextInt();

			avg=(num1+num2+num3)/3;
			System.out.println("Average of ( "+num1+", "+num2+", "+num3+" ) is = "+avg);			

	}
}
//output
//E:\Module1\Vaibhav Baraskar>javac AverageOfThreeNumbers.java
//E:\Module1\Vaibhav Baraskar>java AverageOfThreeNumbers
//Input 1st number
//50
//Input 2nd number
//50
//Input 3rd number
//50
//Average of ( 50, 50, 50 ) is = 50
