package Stringdata;

import java.util.Arrays;
import java.util.Scanner;

/*3. Write a function to replace multiple consecutive occurrences of characters with a single character
Input : abccddde
Output : abcde
Input : aabbbbaaa
Output : aba
*/

public class ReplaceCharactersWithSIngal {
	
	
	void removieDuplicates(String s) {
		char arr[]=s.toCharArray();
        int x=arr.length, count;
        
        for(int i=0;i<x-1;i++)
        {
            count=0;
            for(int j=0;j<x;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    if(count>1)
                    {
                        arr[j]=' ';
                        break;
                    }
                }
            }
        }
        for(int i=0;i<x;i++)
        {
            if(arr[i]!=' ')
                System.out.print(arr[i]);
        }
	}
	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter A String := ");
    String s=sc.next();
        ReplaceCharactersWithSIngal ob=new ReplaceCharactersWithSIngal();
	
        ob.removieDuplicates(s);
	}
}
