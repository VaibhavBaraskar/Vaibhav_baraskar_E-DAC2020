package StringPractise;

class A{
	
}
class B{
	public String toString() {
		return "Hii";
	}
}

class DemoTest{
	int x;
	DemoTest(int x){
		this.x=x;
	}
	
	public String m1() {
		return String.valueOf(x);
	}
}
public class ValueOfTesting {

	public static void main(String[] args) {
		
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(10.67));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(true));
		
		System.out.println(String.valueOf("abc"));
		System.out.println(String.valueOf(new char[] {'a','b'}));
		try {
		System.out.println(String.valueOf(null));
		}catch (Exception e) {
			System.err.println("Null Pointer Exception\n");
		}
		System.out.println(String.valueOf((String)null));
		System.out.println(String.valueOf((A)null));
		System.out.println(String.valueOf(new A()));
		System.out.println(String.valueOf(new B()));
		
		System.out.println(Integer.toString(10));
		DemoTest b=new DemoTest(109);
		System.out.println(b.m1());
	
	}

}
