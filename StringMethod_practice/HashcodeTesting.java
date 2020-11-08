package StringPractise;


class Hashchange{
int x;
	Hashchange(int x){
		this.x=x;
	}
	
	public int hashCode() {
	return x;
}
}
public class HashcodeTesting {

	public static void main(String[] args) {

		String s1=new String("a");
		String s2=new String("a");
		String s3=new String("abc");


		
		System.out.println(s1.hashCode());//{s[0]*(31(length-1))+s[1]*(31(length-2))+....+s[length-1]
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	
		System.out.println();
		
		String s4="a";
		String s5="a";
		
		
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		
		System.out.println();
		
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		
	
		Hashchange obj1=new Hashchange(100);
		Hashchange obj2=new Hashchange(100);
		Hashchange obj3=new Hashchange(105);
	
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(System.identityHashCode(obj3));
		
		System.out.println();
		
		obj1.x=1000; obj2.x=2000; obj3.x=3000;
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println();
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(System.identityHashCode(obj3));
		
	}

}
