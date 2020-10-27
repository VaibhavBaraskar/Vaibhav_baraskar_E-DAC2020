class Q_ROfDivision{
public static void main(String... args){

//int a=13;
//System.out.println(++a + a++ + ++a + a++);

int a=16,b=2;
int r=0;
int q=0;
while(a>0){

a=a/b;
q=a;
System.out.println("Q = "+q);
r=a%b;
System.out.println("R = "+r);
}

}
}

