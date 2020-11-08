package StringPractise;

class Oxy{
	private int a;
	Oxy(int a){
		this.a=a;
	}
	@Override
	public String toString() {
		return " "+a;
	}
	
	
	
}


public class ToStringTesting {

	static String s4;
	
static Oxy obj3;
	public static void main(String[] args) {
		
		String s1="Vaibhav Baraskar";
		System.out.println("s1 : "+s1);
		System.out.println("s1 : "+s1.toString());
		System.out.println();
		
		String s2=new String("Baraskar");
		System.out.println("s2 : "+s2);
		System.out.println("s2 : "+s2.toString());
		System.out.println();
		
		String s3=null;
		try {
		System.out.println("s3 : "+s3);
		System.out.println("\ns3 : "+s3.toString());
		}
		catch(Exception e) {
			System.err.println("Null pointer Exception");
		}
		System.out.println();
		
		
		System.out.println("s4 : "+s4);
		System.out.println();
		
		Oxy obj=new Oxy(223);
		System.out.println("obj : "+obj);
		System.out.println();
		
		Oxy obj2=null;
		try {System.out.println("obj2 : "+obj2);}catch(Exception e) {System.err.println("null pointer exception");}
		System.out.println();
		
		System.out.println("Obj3 : "+obj3);
	}

}
