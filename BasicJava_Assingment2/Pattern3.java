import java.util.Scanner;
class Pattern3{
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter upto how mach level you wont drow trangle");
		int value=sc.nextInt();
		
		int  j=value;
			for (int i=1;i<=value;i++) {
					for (int k=1;k<=j;k++) {
							System.out.print(" ");
							}
					for (int l=1;l<=i;l++) {
							System.out.print("* ");
							
							}
						System.out.println();
							j=j-1;
					}
		

		
	}
}

//output
//E:\Module1\Pattern program>javac Pattern3.java
//E:\Module1\Pattern program>java Pattern3
//Enter upto how mach level you wont drow trangle
//9
//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//    * * * * * *
//   * * * * * * *
//  * * * * * * * *
// * * * * * * * * *