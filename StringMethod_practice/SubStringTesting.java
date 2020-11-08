package StringPractise;

public class SubStringTesting {

	public static void main(String[] args) {
	
		String s1="abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(s1.substring(5));		
		System.out.println(s1.substring(5,11));
		System.out.println(s1.substring(5,12));
		System.out.print(s1.substring(5,5));
		try {
		System.out.print(s1.substring(12,5));
		}catch (Exception e) {
			System.err.print("\nString index out of range: -7");
		}
		try {
		System.out.print(s1.substring(-1,12));
		}catch (Exception e) {
			System.err.println("\nString index out of range: -1");
		}
		System.out.println(s1.substring(4,27));
		System.out.println(s1.substring(5,25));
		System.out.println(s1.substring(5,26));
		
		String s2="Java Programming Language";
		
		System.out.println(s2.substring(5,12));
		
		int start= s2.indexOf("Program");
		int end=start+7;
System.out.println(s2.substring(start, end));
	
	}

}
