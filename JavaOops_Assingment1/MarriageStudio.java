//15.	Accept person’s gender (character m for male and f for female), age (integer), as input and then check 
//whether person is eligible for marriage or not.
package basic_program;

import java.util.Scanner;

public class MarriageStudio {

	int age;
	String gender="";
	
	 void setGender(String gender) {
		this.gender=gender;
	}
	 
	void camMarriagePossible(MarriageStudio ob) {
		if(ob.age>=19 &&ob.gender=="Female" ) {
			System.out.println("She is eligiable for Marray!!!!");
		}else if(ob.age<19 &&ob.gender=="Female"){
			System.out.println("She is not eligiable for Marray dont hurry it will happen one day!!!!");
		}
		if(ob.age>=22 &&ob.gender=="Male" ) {
			System.out.println("He is eligiable for Marray!!!!");
		}else if(ob.age<22 &&ob.gender=="Male"){
			System.out.println("He is not eligiable for Marray dont hurry it will happen one day!!!!");
		}
	} 
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	MarriageStudio obj=new MarriageStudio();
	System.out.println("Enter the Gender ");
	char G=sc.next().charAt(0);
	System.out.println("Enter the Age ");
	int ages=sc.nextInt();
	if(G =='m'|| G=='M') {
		String g="Male";
		obj.setGender(g);
		obj.age=ages;
	}else if(G =='f'|| G=='F') {
		String g="Female";
		obj.setGender(g);
		obj.age=ages;
	}else {
		System.out.println("Please enter valid details!!!!!!!!!!!");
	}
	
	obj.camMarriagePossible(obj);
	
	}

}
