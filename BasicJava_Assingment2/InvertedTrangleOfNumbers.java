class InvertedTrangleOfNumbers{

public static void main(String... args){

for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++){
			System.out.print(" ");
			}
		int ll=9,mm=9;del=9;
			for(int j=9;j>=i;j--){
					System.out.print(del--);
				
				}ll--;
			for(int k=9 ; k>i ; k--){
					System.out.print(mm);
				}mm--;
System.out.println();
}

}

}

//oputput
//E:\Module1\Pattern program>javac InvertedTrangleOfNumbers.java
//E:\Module1\Pattern program>java InvertedTrangleOfNumbers
// 99999999999999999
//  999999999999999
//   9999999999999
//    99999999999
//     999999999
//      9999999
//       99999
//        999
//         9