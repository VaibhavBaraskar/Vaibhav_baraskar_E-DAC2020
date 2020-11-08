package Stringdata;

//4. Given a string, print the first non-repeating character in the string.
//Input: "aabbccdeeff", Output: d
//Input: "aabbccddeeffgg", Output: "Not found"
import java.util.Scanner;

public class Non_RepeatingCharacterOfString {

	void nonRepeatingCharacter(String s) {
		char arr[] = s.toCharArray();
		int count = 0;
		char y = ' ';

		for (int i = 1; i < (arr.length - 1); i++) {
			if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) {
				y = arr[i];
				count++;
				break;
			}
		}
		if (count == 1)
			System.out.println(y);
		else
			System.out.println("Not found");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String := ");
		String s = sc.next();
//String s="aabbccdeeff";

		Non_RepeatingCharacterOfString ob = new Non_RepeatingCharacterOfString();
		System.out.print("Non reperting characters are := ");
		ob.nonRepeatingCharacter(s);

	}

}
