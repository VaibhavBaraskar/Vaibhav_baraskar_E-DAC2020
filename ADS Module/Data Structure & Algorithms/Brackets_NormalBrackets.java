package BasicsPrograms;

public class Brackets_NormalBrackets {
private String s="";
private MyStackCreation ob;
Brackets_NormalBrackets(String s){
	this.s=s;
	ob=new MyStackCreation(6);
}

 void insert() {
	 for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)=='(') {
			System.out.println('('+" Element is ADDED  to stack ");
			ob.push((char)'(');
		}else if(s.charAt(i)==')') {
			if(ob.isEmpty()) {
				System.out.println(" Stack is under flow ");
			}else {
			
			ob.pop();
			System.out.println("()"+" Element is REMOVED  ");
			}
			}
	}
 } 

 void isErrorPresent() {
	 if(ob.isEmpty()) {
		 System.out.println("Everything is good no error");
	 }else {
		 System.out.println("Error there may be a opening brackets are there!!! ");
	 }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Brackets_NormalBrackets new_ob=new Brackets_NormalBrackets("((())");
	new_ob.insert();
	new_ob.isErrorPresent();
	}

}
