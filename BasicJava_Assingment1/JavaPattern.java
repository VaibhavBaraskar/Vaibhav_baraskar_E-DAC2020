//8. Write a Java program to display the following pattern.
//Sample Pattern :


//   1 2 3 j 5 6 7 8 a 10 11 12 13 v 15 16 17 18 19 v 21 22 23 a 25 26 27
//   1 2 3 j       a   a             v            v          a   a      
//   j 2 3 j     a a a a  a             v      v          a  a a a  a
//   1 j j     a            a               v          a              a



class JavaPattern{

	public static void main(String[] args){
		System.out.println("      j         a             v                v          a          ");
		System.out.println("      j       a   a             v            v          a   a        ");
		System.out.println("j     j     a a a a  a             v      v          a  a a a  a     ");
		System.out.println("  j j     a            a               v          a              a   ");
	}

}

//output
//E:\Module1\Vaibhav Baraskar>javac JavaPattern.java
//E:\Module1\Vaibhav Baraskar>java JavaPattern
//      j         a             v                v          a
//      j       a   a             v            v          a   a
//j     j     a a a a  a             v      v          a  a a a  a
//  j j     a            a               v          a              a