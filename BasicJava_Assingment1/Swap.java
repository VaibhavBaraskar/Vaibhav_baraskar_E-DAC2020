//15. Write a Java program to swap two variables.


class Swap{

	public static void main(String[] args){
          int num1=5;
          int num2=10;

System.out.println("Before swap :"+ num1+", "+num2);
//first method
int temp;
temp= num1;
num1=num2;
num2=temp;
System.out.println("After swap :"+ num1+", "+num2);


System.out.println("Before swap :"+ num1+", "+num2);
//second method
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println("After swap :"+ num1+", "+num2);


System.out.println("Before swap :"+ num1+", "+num2);
//third method

num1=num1*num2;
num2=num1/num2;
num1=num1/num2;
System.out.println("After swap :"+ num1+", "+num2);


System.out.println("Before swap :"+ num1+", "+num2);
//forth method

num1=num1^num2;
num2=num1^num2;
num1=num1^num2;
System.out.println("After swap :"+ num1+", "+num2);

	}

} 
//output
//E:\Module1\Vaibhav Baraskar>javac Swap.java
//E:\Module1\Vaibhav Baraskar>java Swap
//Before swap :5, 10
//After swap :10, 5
//Before swap :10, 5
//After swap :5, 10
//Before swap :5, 10
//After swap :10, 5
//Before swap :10, 5
//After swap :5, 10