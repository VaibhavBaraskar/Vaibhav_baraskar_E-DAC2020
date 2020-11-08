package Stringdata;

import java.util.Scanner;

//6. Given a string, check whether it is a formed by concatenating the same string 3 times.
//Input: "abcabcabc", Output: true (abc is repeated 3 times)
//Input: "abcdabcdabcd", Output: true (abcd is repeated 3 times)
//Input: "andandan', Output: false
public class CountRepetationOfString {
	
	void countRepetation(String s) {
		char arr[]=s.toCharArray();
        
        int count=0;
        int y=s.indexOf(arr[0],1);
        
        if(3*y==arr.length)
        {
            for(int i=0;i<2*y;i++)
            {
                if(arr[i]==arr[i+y])
                    count++;
            }
        }
        if(count==(2*y))
            System.out.println("true");
        else
            System.out.println("false");
	}

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.print("Enter String := ");
         
         String s=sc.nextLine();
         
         CountRepetationOfString ob=new CountRepetationOfString();
         ob.countRepetation(s);
         
	}

}
