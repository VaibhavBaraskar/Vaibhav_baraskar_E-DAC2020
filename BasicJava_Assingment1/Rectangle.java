//13. Write a Java program to print the area and perimeter of a rectangle.
//Test Data:
//Width = 5.5 Height = 8.5
//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20

//p=2*height+width;
//a=height*width;


class Rectangle{

	public static void main(String[] args){
		float width = 5.5f ;
		float height = 8.5f;
		float area,perimeter;
		
		area=(width * height);
		System.out.println("Rectangle with height ="+height +" & width ="+width +" its Area is :"+area);

		perimeter=2*(width + height ) ;
		System.out.println("Rectangle with height ="+height +" & width ="+width +" its Perimeter is :"+perimeter);
	}

}

//output
//E:\Module1\Vaibhav Baraskar>javac Rectangle.java
//E:\Module1\Vaibhav Baraskar>java Rectangle
//Rectangle with height =8.5 & width =5.5 its Area is :46.75
//Rectangle with height =8.5 & width =5.5 its Perimeter is :28.0
