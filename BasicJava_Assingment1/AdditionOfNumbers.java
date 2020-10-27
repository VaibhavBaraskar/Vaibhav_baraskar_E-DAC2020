
import java.util.Scanner;
class AdditionOfNumbers{

static{
System.out.println("Three Ways petrformed operation 1.Hardcoded 2.userdefined 3. command line \n");

}
public static void main(String... w){

System.out.println("1.Hard coded");
int num1=10;
int num2=20;
int num3=num1+num2;
System.out.println("\n1st Number"+num1);
System.out.println("2nd Number"+num2);
System.out.println("Addition of above number is : "+num3);


System.out.println("\n2.User Defined");
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number");
int n1=sc.nextInt();
System.out.println("Enter 2nd number");
int n2=sc.nextInt();

int n3=n1+n2;
System.out.println("You have Entered "+n1+" , "+n2+" and its Addition is : "+n3);

System.out.println("\n\n3. Command line ");
if((w.length-1)>0)
{int a1=Integer.parseInt(w[0]);
int a2=Integer.parseInt(w[1]);

int a3= a1+a2;

System.out.println("You entered From command line are "+a1+" , "+a2+" and its Addition is : "+a3 );
 
}
else{
System.out.println("You have not entered the Command line aurguments");

}
}
}