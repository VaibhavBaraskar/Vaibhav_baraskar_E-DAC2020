import java.util.Scanner;
class Pattern1{
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter upto how mach level you wont drow (from 1 to 9) trangle");
		int value=sc.nextInt();
	if(value<10){		
		int  j=value;
			for (int i=1;i<=value;i++) {
					for (int k=1;k<=j;k++) {
							System.out.print(" ");
							}
					for (int l=1;l<=i;l++) {
							System.out.print(l+" ");
							
							}
						System.out.println();
							j=j-1;
					}
		

		}else{
			System.out.println("You havent entered value between 1 to 9 ");
		}
	}
}


//output
//E:\Module1\Pattern program>javac Pattern1.java
//E:\Module1\Pattern program>java Pattern1
//Enter upto how mach level you wont drow (from 1 to 9) trangle
//9
//         1
//        1 2
//       1 2 3
//      1 2 3 4
//     1 2 3 4 5
//    1 2 3 4 5 6
//   1 2 3 4 5 6 7
//  1 2 3 4 5 6 7 8
// 1 2 3 4 5 6 7 8 9



 








	 
	 	 