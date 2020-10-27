//12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
//If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. 
//If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]

package basic_program;

import java.util.Scanner;

public class GrossSalary {

	void calculateGrossSalary(double basicSalary,double hra,double da) {
		double grossSalary=basicSalary+hra+da;
		
		System.out.println("The Gross Salary := "+grossSalary);
	}
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		double hra=0;
		double da=0;
		System.out.print("Enter the basic Salary of Employee := ");
		double basicSalary= sc.nextDouble();
		
		if(basicSalary < 10000) {
			hra=(basicSalary*0.10);
			da=(basicSalary*0.90);
		}else if(basicSalary >= 10000) {
			hra=2000;
			da=(basicSalary*0.98);
		}
		
		GrossSalary obj=new GrossSalary();
		obj.calculateGrossSalary(basicSalary,hra,da);
	}

}
