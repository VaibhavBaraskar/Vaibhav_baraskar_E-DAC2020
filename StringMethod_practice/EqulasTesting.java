package StringPractise;

class EqualsOverriding{
	int x;
	EqualsOverriding(int x){
		this.x=x;
	}
	public boolean equals(Object obj) {
		if(obj instanceof EqualsOverriding)
		{
			EqualsOverriding ob=(EqualsOverriding)obj;
			return(this.x == ob.x);
		}
		return false;
}
}

public class EqulasTesting {

	public static void main(String[] args) {

		
		 String s1="a"; 
		 String s2="a"; 
		 String s3=new String("a");
		 String s4=new String("a");
		 
		 StringBuffer sb1=new StringBuffer("a");
		 StringBuffer sb2=new StringBuffer("a");
		 
		 System.out.println(s1==s2);
		 System.out.println(s3==s4);
		 System.out.println(sb1==sb2);
		 System.out.println();
		 System.out.println(s1.equals(s2));
		 System.out.println(s3.equals(s4));
		 System.out.println(sb1.equals(sb2));
		 System.out.println();
		 String s5="a";
		 String s6="A";
		 System.out.println(s5==s6);
		 System.out.println(s5.equals(s6));
		 System.out.println(s5.equalsIgnoreCase(s6));
	System.out.println();

		 EqualsOverriding obj1=new EqualsOverriding(100);
		 EqualsOverriding obj2=new EqualsOverriding(100);
		 EqualsOverriding obj3=new EqualsOverriding(200);
		 
		 EqualsOverriding obj4=obj3;
		 System.out.println(obj1==obj2);
		 System.out.println(obj2==obj3);
		 System.out.println(obj3==obj4);
		 System.out.println();
		 System.out.println(obj1.equals(obj2));
		 System.out.println(obj2.equals(obj3));
		 System.out.println(obj3.equals(obj4));
		 System.out.println();
		 
		 EqulasTesting z=new EqulasTesting();
		 //System.out.println(obj1==z);
		 System.out.println(obj1.equals(z));
		 System.out.println(z.equals(obj1));
		 System.out.println();
		 System.out.println(z==null);
		 System.out.println(z.equals(null));
		 System.out.println();
		 System.out.println(obj1==null);
		 System.out.println(obj1.equals(null));
		 
	
	
	
	}

}
