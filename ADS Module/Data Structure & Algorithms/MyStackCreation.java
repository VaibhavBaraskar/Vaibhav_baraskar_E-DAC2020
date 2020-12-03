package BasicsPrograms;

import java.util.Scanner;

public class MyStackCreation {

	private int[] myStack;
	private int top;
	private int poped;
	 private int size;

	MyStackCreation(int size) {
		top = 0;
		myStack = new int[size];
		this.size=size;
	}

	void push(int insertMe) {
		if (isFull())
			System.out.println("====Stack overflow====");
		else
			myStack[top] = insertMe;
		top++;
	}

	void pop() {
		if (top <= 0) {
			System.out.println("====Stack is Empty You can not pop operation");
		} else {
			//System.out.println("\n"+myStack[top-1]+ " is removed from Stack ");
			System.out.println("\n Elements is removed from Stack ");
			--top;
		}
		

	}

	boolean isEmpty() {
		return top == 0;
	}

	int peek() {
		if (isEmpty()) {
			System.out.println("does not contain any elements :");
			return -1;
		} else {
			return myStack[top-1];
		}
	}
	
	boolean isFull() {
		return top==size;
	}
	
	void printStack() {
		for (int i = 0; i < top; i++) {
			System.out.print(myStack[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Stack");
		int size=sc.nextInt();
		MyStackCreation ob=new MyStackCreation(size);
		
		System.out.println("Enter the Elements : ");
		for (int i = 0; i < size; i++) {
			int p=sc.nextInt();
			ob.push(p);
		}

		ob.printStack();
		System.out.println("\nRemoving elements : ");
		ob.pop();
		System.out.print("\nPeek ok Stack : "+ob.peek());
		
		
		System.out.println("\n is Empty : "+ob.isEmpty());
		System.out.println("is full : "+ob.isFull());
		ob.push(80);
		ob.printStack();
	}

}
