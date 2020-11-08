package StringPractise;

import java.util.Scanner;

public class IsEmptyTesting {

  static String s9;
	
	public static void main(String[] args) {
	
		String s1="";
		String s2=" ";
		String s3="a";
		String s4= new String();
		String s5= new String("");
		String s6= new String(" ");
		String s7= new String("a");
		
		
		System.out.println("is S1 Empty := "+s1.isEmpty());
		System.out.println("is S2 Empty := "+s2.isEmpty());
		System.out.println("is S3 Empty := "+s3.isEmpty());
		System.out.println("is S4 Empty := "+s4.isEmpty());
		System.out.println("is S5 Empty := "+s5.isEmpty());
		System.out.println("is S6 Empty := "+s6.isEmpty());
		System.out.println("is S7 Empty := "+s7.isEmpty());
		
		
	try {
		String s8=null;
		//System.out.println("\nis S8 Empty := "+s8.isEmpty());
		System.out.println("\nis S9 Empty := "+s9.isEmpty());
	}catch(Exception e){
		System.err.println("Null pointer exception ");
	}
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 10 := ");
		System.out.println(sc.nextLine().isEmpty());
		
	}

}
