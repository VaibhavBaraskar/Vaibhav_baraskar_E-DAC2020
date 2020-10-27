//7. Write a Java program that takes a number as input and prints its multiplication
//table upto 10.
//Test Data:
//Input a number: 8
//Expected Output :
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//...
//8 x 10 = 80



import java.util.Scanner;
class TableOfNumber{

	static public  void main(String[] args){
		int num,output;
		 Scanner sc= new Scanner(System.in);		
			System.out.println("Input a number");
			num=sc.nextInt();
			for(int i=1;i<11;i++){
				output=i*num;
				System.out.println(num+" * "+i+" = "+output);
			}

	}
}

//output
//E:\Module1\Vaibhav Baraskar>javac TableOfNumber.java
//E:\Module1\Vaibhav Baraskar>java TableOfNumber
//Input a number
//20

//20 * 1 = 20
//20 * 2 = 40
//20 * 3 = 60
//20 * 4 = 80
//20 * 5 = 100
//20 * 6 = 120
//20 * 7 = 140
//20 * 8 = 160
//20 * 9 = 180
//20 * 10 = 200