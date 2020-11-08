package StringPractise;

public class InternTesting {

	public static void main(String[] args) {
		String s1=" vaibhav    ";
		String s2=s1.intern();// a string that has the same contents as this string, but is guaranteed to be from a pool of unique strings
		System.out.println(s1==s2);
	
	String s3=new String("Baraskar");
	String s4=s3.intern();
	String s5="Baraskar";
	System.out.println(s3==s4);
	System.out.println(s3==s5);
	
	String s6=s1.trim();
	String s7=s6.intern();
	System.out.println(s6==s7);
	
	String s8="VaibhavBaraskar";
	String s9=s6.concat(s5);
	String s10=s9.intern();
	
	System.out.println(s8==s10);
	}

}
