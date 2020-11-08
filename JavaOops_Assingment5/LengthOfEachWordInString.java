package Stringdata;

import java.util.Scanner;

//5. Write a program which prints the length of each word in a sentence.
//Input: I am a Java programmer
//Output: 1 2 1 4 10

public class LengthOfEachWordInString {

	void findLengthOfWord(String s) {

		String[] arr = s.split(" ");
		int[] len = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			len[i] = arr[i].length();
		}

		for (int j = 0; j < len.length; j++) {
			System.out.print(len[j] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String := ");
		String s = sc.nextLine();

		LengthOfEachWordInString ob = new LengthOfEachWordInString();
		System.out.println(s);
		ob.findLengthOfWord(s);

	}

}
