package StringPractise;

public class JoinTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=String.join("-","a","b","c","d","e");
		String s2=String.join("","a","b","c","d","e");
		String s3=String.join("-");
		String s4=String.join("-","a");
		String s5=String.join("-","a","b");
		String s6=String.join("-","a",new StringBuffer("b"),new StringBuffer("c"));
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		System.out.println("s4 : "+s4);
		System.out.println("s5 : "+s5);
		System.out.println("s6 : "+s6);
		
		
		String s7="p";
		String s8=s7+"q";
		
	String s9=s7.concat("q");
	System.out.println();
	System.out.println("s7 : "+s7);
	System.out.println("s8 : "+s8);
	System.out.println("s9 : "+s9);
System.out.println();

String s10="a"+"b"+"c"+"d";
String s11="a".concat("b").concat("c").concat("d");
String s12=String.join("","a","b","c","d");
String s13=String.join("-","a","b","c","d");

System.out.println(s10);
System.out.println(s11);
System.out.println(s12);
System.out.println(s13);

System.out.println(s10.equals(s11));
System.out.println(s10 == s11);
System.out.println(s11.equals(s12));
		
	}

}
