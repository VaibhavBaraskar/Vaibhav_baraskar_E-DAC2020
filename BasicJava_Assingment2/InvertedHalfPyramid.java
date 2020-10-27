import java.util.Scanner;
public class InvertedHalfPyramid{

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of levels to be created");	
		int level=sc.nextInt();
	int count=level;
	for(int i=1;i<level;i++){
			int p=count;char ch='*';
		for(int j=level;j>=i;j--){
			if(p>0)
			{System.out.print(ch); p--;}
		}
		count--;
		System.out.println();
		

			}
	System.out.println("*");
	}
}
//output
//E:\Module1\Pattern program>javac InvertedHalfPyramid.java
//E:\Module1\Pattern program>java InvertedHalfPyramid
//Enter the number of levels to be created
//12
//************
//***********
//**********
//*********
//********
//*******
//******
//*****
//****
//***
//**
//*


//for(int i=1;i<=level;i++){
//	for(int j=i;j<=level;j++){System.out.print("*");}
//	System.out.println();}