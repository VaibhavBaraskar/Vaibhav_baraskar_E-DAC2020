package Stringdata;

//1.Write a program which takes a string and prints the number of vowels,
//consonants (non-vowels) numbers and other characters.
//Input: "Hello world 37 1!"
//Output: Vowels: 3
//Consonants: 7
//Numbers: 2
//Others: 6
import java.util.Scanner;

public class CountVowelsCosonantsAndOthers {

	
	Scanner sc=new Scanner(System.in);
	void FindNoOfVowelsConsonantsAndOthers()
	{
		int vctr=0,cctr=0,nctr=0,sctr=0;
		System.out.print("Enter the String := ");
		String strN=sc.nextLine();
		String str=strN.toLowerCase();
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vctr++;
			}
			else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
			{
				nctr++;
			}
			else if(ch=='@'||ch=='!'||ch=='#'||ch=='$'|| ch=='%'||ch=='^'||ch=='*'||ch=='&')
			{
				sctr++;
			}
			else if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
			{	
				if(ch==' ')
				{
					continue;
				}
				else
					cctr++;
			}
			/*
			else if(ch!=' ')
				if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
					cctr++;
			*/
			/*else if(ch!=' '|| ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u')
			{
				
					cctr++;
			}*/
		}
		System.out.println("VOWELS : "+vctr);
		System.out.println("CONSONANTS : "+cctr);
		System.out.println("NUMBER : "+nctr);
		System.out.println("OTHERS : "+sctr);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CountVowelsCosonantsAndOthers obj =new CountVowelsCosonantsAndOthers();
		obj.FindNoOfVowelsConsonantsAndOthers();
	}

}
