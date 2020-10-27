//03.	Find the result of following expressions. You need to determine the primitive data type of the variable by 
//looking carefully the given expression and initialize variables by any random value.
//A. y = x2 + 3x - 7 (print value of y) 
//B. y = x++ + ++x (print value of x and y) 
//C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
//D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]


package basic_program;

public class PrimitiveDataTypeVariables {

	
	void a(int x){
		System.out.println("y = x2 + 3x - 7   Solution value of y :=");
		int y=(x*x)+(3*x)-7;
		System.out.println("Integer value of Y :="+y); 
	}
	void b(int p,int q){
		System.out.println("\ny=x++ + ++x    Solution value of x ,y :=");
		int x=p;
		int y=q;
		 y=x++ + ++x;
		System.out.println("Integer value of X :="+x); 
		System.out.println("Integer value of Y :="+y); 
	}
	void c(int p,int q){
		System.out.println("\ny=x++ - --y - --x  +  x++   Solution value of x ,y :=");
		int x=p;
		int y=q;
		 y=x++ - --y - --x + x++;
		System.out.println("Integer value of Y :="+y); 
	}
	void d(boolean p,boolean q){
		System.out.println("\nz = x && y || !(x || y)   Solution value of x ,y and z:=");
		boolean x=p;
		boolean y=q;
		 boolean z = (x && y||(x || y));
		 System.out.println("Boolean value of X :="+x); 
		 System.out.println("Boolean value of Y :="+y); 
   		 System.out.println("Boolean value of Z :="+z); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimitiveDataTypeVariables obj=new PrimitiveDataTypeVariables();
		obj.a(10);
		obj.b(1, 2);
		obj.c(5, 4);
		obj.d(true, false);
	}

}
