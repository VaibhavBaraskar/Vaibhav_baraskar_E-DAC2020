package StringPractise;

public class CharAtTesting {

	public static void main(String[] args) {
		
		String s1="abcdef";
		
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(3));
		try {
		System.out.println(s1.charAt(6));
		}
		catch (Exception e) {
		System.err.println("\nString index out of range: 6\n");	
		}
		
		System.out.println(s1.charAt(0));
	
		try {
		System.out.print(s1.charAt(-1));
	}catch (Exception e) {
		System.err.println("String index out of range: -1\n");
	}
		
	try {	
	System.out.println(s1.charAt('a'));
	}catch (Exception e) {
		System.err.println("String index out of range: 97");
	}
	
	
	}

}
