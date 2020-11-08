package StringPractise;

import java.util.StringTokenizer;

public class StringTokenizerTesting {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Vaibhav Baraskar");
		
		System.out.println("Number of Tokens : "+st.countTokens());
		while(st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.println(token);
		}
	}

}
