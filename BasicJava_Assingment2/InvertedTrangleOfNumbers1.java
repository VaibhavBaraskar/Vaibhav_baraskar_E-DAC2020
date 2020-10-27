class InvertedTrangleOfNumbers1{

public static void main(String... args){

for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++){
			System.out.print(" ");
			}
		int ll=9;
			for(int j=9;j>=i;j--){
					System.out.print(ll);
				
				}ll--;
			for(int k=9 ; k>i ; k--){
					System.out.print(i);
				}
System.out.println();
}

}

}

//oputput
//E:\Module1\Pattern program>javac InvertedTrangleOfNumbers.java
//E:\Module1\Pattern program>java InvertedTrangleOfNumbers
// 99999999911111111
//  999999992222222
//   9999999333333
//    99999944444
//     999995555
//      9999666
//       99977
//        998
//         9