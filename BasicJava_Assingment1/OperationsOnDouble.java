//9. Write a Java program to compute the specified expressions and print the output.
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
//Expected Output
//2.138888888888889



class OperationsOnDouble{

	final public static void main(String[] args){
		double output;
		output = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println("output is: "+output); 
	}

}

//output
//E:\Module1\Vaibhav Baraskar>javac OperationsOnDouble.java
//E:\Module1\Vaibhav Baraskar>java OperationsOnDouble
//output is: 2.9760461760461765