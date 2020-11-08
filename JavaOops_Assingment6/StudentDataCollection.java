package Assingment6;

/*1.	Create a class Student with 2 data members rollno and name. 
Create one method setData() that takes roll number and student name as parameter and stores them in data members rollno and name. 
Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates 
Student class object and calls setData() and showData() methods.*/
class StudentDataPart{
	int rollNo;
	String name;
	void setData(int rollNo,String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	void showData() {
		System.out.println("Student Roll Number := "+this.rollNo+"  Student name := "+this.name);
	}
}

public class StudentDataCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDataPart ob=new StudentDataPart();
		
		ob.setData(1, "Vaibhav Baraskar");
		ob.showData();
	}

}
