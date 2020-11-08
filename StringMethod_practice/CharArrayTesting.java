package StringPractise;

import java.util.Arrays;

public class CharArrayTesting {

	public static void main(String[] args) {
		String s1="Vaibhav";
		char[] ch=s1.toCharArray();
		byte[] b=s1.getBytes();
		
		System.out.println("s1 : "+s1);
		System.out.println("ch[] : "+Arrays.toString(ch));
		System.out.println("b[] : "+Arrays.toString(b));
	}

}
