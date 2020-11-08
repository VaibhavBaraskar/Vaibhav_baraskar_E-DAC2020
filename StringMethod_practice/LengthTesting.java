package StringPractise;

import java.util.Scanner;

public class LengthTesting {

	static String s9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="";
		String s2=" ";
		String s3="a";
		String s4= new String();
		String s5= new String("");
		String s6= new String(" ");
		String s7= new String("a");
		
		
		System.out.println("is S1 Length := "+s1.length());
		System.out.println("is S2 Length := "+s2.length());
		System.out.println("is S3 Length := "+s3.length());
		System.out.println("is S4 Length := "+s4.length());
		System.out.println("is S5 Length := "+s5.length());
		System.out.println("is S6 Length := "+s6.length());
		System.out.println("is S7 Length := "+s7.length());
		
		
	try {
		String s8=null;
		System.out.println("\nis S8 Length := "+s8.length());
		System.out.println("\nis S9 Length := "+s9.length());
	}catch(Exception e){
		System.err.println("Null pointer exception ");
	}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 10 := ");
		System.out.println(sc.nextLine().length());
	}

}
