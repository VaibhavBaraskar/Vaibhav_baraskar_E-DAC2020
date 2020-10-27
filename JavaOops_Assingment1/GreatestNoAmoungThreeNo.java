//13.	Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  
package basic_program;

import java.util.Scanner;

public class GreatestNoAmoungThreeNo {

	void compareNosUsingIfElse(double num1,double num2,double num3) {
		
		System.out.println("----Using if else loop---- ");
		if(num1>num2 && num2>num3) {
			System.out.println(num1+" is greatest among "+num1+" , "+num2+" , "+num3);
		}else if(num2>num1 && num1>num3){
			System.out.println(num2+" is greatest among "+num1+" , "+num2+" , "+num3);
		}else{
			System.out.println(num3+" is greatest among "+num1+" , "+num2+" , "+num3);
		}
		
	}
	
	void compareNoUsingTernary(double num1,double num2,double num3) {
		
		System.out.println("----using Ternary operator---- ");
		double greatest= ((num1>num2) && (num2>num3))? num1: ((num2>num1)&&(num1>num3))? num2 : num3;
		
		System.out.println(greatest+" is greatest among "+num1+" , "+num2+" , "+num3);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st no := ");
		double num1= sc.nextDouble();
		System.out.print("Enter 2nd no := ");
		double num2= sc.nextDouble();
		System.out.print("Enter 3rd no := ");
		double num3= sc.nextDouble();
		
		GreatestNoAmoungThreeNo obj=new GreatestNoAmoungThreeNo();
		obj.compareNosUsingIfElse(num1,num2,num3);
		
		obj.compareNoUsingTernary(num1, num2, num3);
		
	}

}
