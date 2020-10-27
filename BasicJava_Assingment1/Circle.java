//11. Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586
//p=2*pi*r;
//a=pi*r*r;


class Circle{

	public static void main(String[] args){
	float pi=3.147f;
	float r=7.5f;
double perimeter = 2*pi*r;
System.out.println("circle having radious:"+r+" its Perimeter is:"+perimeter );
double area=pi*r*r;
System.out.println("circle having radious:"+r+" its Area is :"+area );
	}

}

//output
//E:\Module1\Vaibhav Baraskar>javac Circle.java
//E:\Module1\Vaibhav Baraskar>java Circle
//circle having radious:7.5 its Perimeter is:47.20500183105469
//circle having radious:7.5 its Area is :177.0187530517578
