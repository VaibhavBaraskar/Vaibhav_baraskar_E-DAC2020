package StringPractise;

import java.util.Arrays;

public class SplitTesting {

	public static void main(String[] args) {
		
		
		String s1="Vaibhav Baraskar";
		System.out.println(s1);
		
		String[] sar1=s1.split(" ");
		System.out.println(sar1.length);
		System.out.println(Arrays.toString(sar1));

		String[] sar2=s1.split("a");
		System.out.println(sar2.length);
		System.out.println(Arrays.toString(sar2));
		
		String[] sar3=s1.split("x");
		System.out.println(sar3.length);
		System.out.println(Arrays.toString(sar3));
		
		String[] sar4=s1.split("A");
		System.out.println(sar4.length);
		System.out.println(Arrays.toString(sar4));
		
		String[] sar5=s1.split("B");
		System.out.println(sar5.length);
		System.out.println(Arrays.toString(sar5));

		
		s1="abc abc abc";
		String[] sar6=s1.split("c");
		System.out.println(sar6.length);
		System.out.println(Arrays.toString(sar1));
		
		String[] sar7=s1.split("a");
		System.out.println(sar7.length);
		System.out.println(Arrays.toString(sar7));
		
		String[] sar8=s1.split(" abc");
		System.out.println(sar8.length);
		System.out.println(Arrays.toString(sar8));
	
		String[] sar9=s1.split("abc abc abc");
		System.out.println(sar9.length);
		System.out.println(Arrays.toString(sar9));
	
	
		s1="abc.txt";
		String[] sar10=s1.split(".");
		System.out.println(sar10.length);
		System.out.println(Arrays.toString(sar10));
		
		String[] sar11=s1.split("\\.");
		System.out.println(sar11.length);
		System.out.println(Arrays.toString(sar11));
		
		String[] sar12=s1.split("");
		System.out.println(sar12.length);
		System.out.println(Arrays.toString(sar12));

		
		String s2="aa";
		String[] sar13=s2.split("a");
		System.out.println(sar13.length);
		System.out.println(Arrays.toString(sar13));
		
		String s3="aabc aabc";
		String[] sar14=s1.split("a");
		System.out.println(sar14.length);
		System.out.println(Arrays.toString(sar14));
	}

}
