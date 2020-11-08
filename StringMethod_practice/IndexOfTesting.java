package StringPractise;

public class IndexOfTesting {

	public static void main(String[] args) {
		 String s1="Java Programming Language";//String length without the \0 character
		 System.out.println(s1.length());

		 System.out.println();
		 System.out.println(s1.indexOf('a'));
		 System.out.println(s1.lastIndexOf('a'));
		 System.out.println();
	
		 System.out.println(s1.indexOf('A'));// if not present gives -1
		 System.out.println(s1.lastIndexOf('A'));
		 System.out.println();
		 
		 System.out.println(s1.indexOf("Program"));
		 System.out.println(s1.lastIndexOf("program"));
		 System.out.println();
		 
		 System.out.println(s1.indexOf('a',5));
		 System.out.println(s1.lastIndexOf('a',5));
		 System.out.println();
		 
		 System.out.println(s1.indexOf('a',1));
		 System.out.println(s1.lastIndexOf('a',1));
		 System.out.println();
		 
		 System.out.println(s1.indexOf('a',0));
		 System.out.println(s1.lastIndexOf('a',0));
		 System.out.println();
	
		 System.out.println(s1.indexOf('a',24));
		 System.out.println(s1.lastIndexOf('a',24));
		 System.out.println();
		 
		 System.out.println(s1.indexOf('a',30));
		 System.out.println(s1.lastIndexOf('a',30));
		 System.out.println();
	
		 System.out.println(s1.indexOf('a',-5));
		 System.out.println(s1.lastIndexOf('a',-5));
		 System.out.println();
	
		 String s2="HappyWorldDay";
		 
		 System.out.println(s2.indexOf("world"));
		 
		 String s3=s2.toLowerCase();
		 System.out.println(s3.indexOf("world"));//if the word is present in String then it will give Starting index value 
		 
		 System.out.println();
		 System.out.println(s2);
		 System.out.println(s3);
	
  
	}

}
