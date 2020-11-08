package Assingment6;
/*2.	Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init()
method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values
of radius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.*/

class Circle1{
	double radius;
	double area;
	
	void init(double radius) {
		this.radius=radius;
	}
	void calculateArea() {
		final float PI=3.14f;
		this.area=PI*this.radius*this.radius;
	}
	
	void display() {
		System.out.println("Radius of circle := "+this.radius+"  And its Area is :=  "+this.area);
	}
	
}


public class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 ob=new Circle1();
		ob.init(10);
		ob.calculateArea();
		ob.display();
	}

}
