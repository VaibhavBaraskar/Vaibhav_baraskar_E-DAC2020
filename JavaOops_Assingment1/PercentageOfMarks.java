//07.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. 
//Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.
package basic_program;

import java.util.Scanner;

public class PercentageOfMarks {
	
	int subjectNo=1;
	 int scan(){
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter "+subjectNo+" subject marks :=");
		 int num=sc.nextInt();
		 subjectNo++;
		 return num;
	 }
	 
	 
	int sumOfMarks(int num1,int num2,int num3,int num4,int num5 ){
		int sum=num1+num2+num3+num4+num5;
		return sum;
		
	} 
	
	void percentage(int marks){
		
		double percent=marks/(subjectNo-1);
		
		System.out.print("\nPercentage of given marks of a student is := "+percent+" %");
	}
	public static void main(String[] args) {
	
		PercentageOfMarks obj =new PercentageOfMarks();
		
	int num1=obj.scan();
	int num2=obj.scan();
	int num3=obj.scan();
	int num4=obj.scan();
	int num5=obj.scan();
	
	int sumis=obj.sumOfMarks(num1, num2, num3, num4, num5);
	
	obj.percentage(sumis);
		

	}

}
