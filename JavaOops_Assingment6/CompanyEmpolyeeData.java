package Assingment6;

/*5.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.
*/

class EmployeeOfCompany{
	static int empId=0;
	double salary=0.0;
	static double totalSalary=0.0;
	
	EmployeeOfCompany(double salary){
		this.salary=salary;
		this.empId++;
		this.totalSalary=this.totalSalary+this.salary;
	}
	
	static void totalNoOfEmployee() {
		System.out.println("Total number of Employees are := "+empId);
		System.out.println("Total of "+empId+"  Salary is := "+totalSalary);
	}
	
}


public class CompanyEmpolyeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeOfCompany ob=new EmployeeOfCompany(100);
		EmployeeOfCompany ob2=new EmployeeOfCompany(100);
		EmployeeOfCompany ob3=new EmployeeOfCompany(100);
		EmployeeOfCompany ob4=new EmployeeOfCompany(100);
		EmployeeOfCompany ob5=new EmployeeOfCompany(100);
		
		EmployeeOfCompany.totalNoOfEmployee();
	}

}
