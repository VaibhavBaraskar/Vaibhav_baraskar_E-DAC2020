package Stringdata;

import java.util.Scanner;

//7. Given a string , output another string where the case of the characters is reversed.
//Input : "Hello World"
//Output : "hELLO wORLD"
public class ReverseTheString {

	void reverse(String s) {
		String rev = "";
		char[] ch = s.toCharArray();
		for (int i = (ch.length - 1); i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String := ");
		String s = sc.nextLine();

		ReverseTheString ob = new ReverseTheString();
		ob.reverse(s);

	}

}
