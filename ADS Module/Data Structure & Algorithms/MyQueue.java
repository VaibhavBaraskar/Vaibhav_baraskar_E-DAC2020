package BasicsPrograms;

public class MyQueue {

	private int front;
	private int rear;
	private int[] myQueue;
	private int size;
	private int deletedData;
	
	MyQueue(int size){
		front=-1;
		rear=-1;
		myQueue=new int[size];
		this.size=size;
	}
	
	boolean isEmpty() {
		return (front==-1 );
	} 
	
	boolean  isFull() {
		return (front == 0 && rear == size - 1);
	}
	
	void enqueue(int insertMe ) {
		if(!isFull()) {
		
			if(front==-1) front=0;
			rear++;
			myQueue[rear]=insertMe;
			System.out.println(insertMe +" is inserted ");
		}else {
			System.out.println("-----QueueOverflow-----");
		}
		
	}
	
	
	void dequeue() {
		if(!isEmpty()) {
			deletedData=myQueue[front];
			if(front<rear) {
				front++;
				//System.out.println(deletedData+" is deleted ");
			}else if(front>=rear){
				front=-1;
				rear=-1;
				System.out.println(deletedData+" is deleted ");
				System.out.println("-----As Elements deleted so here afterwords Queue is Empty-----");
			}
			if(front<rear) {
			System.out.println(deletedData+" is deleted ");
			}
		}
	}
	
	void display() {
		if(isEmpty()) {
			System.out.println(" Queue is Empty ");
		}else {
			for (int i = front; i <= rear; i++) {
				System.out.print(myQueue[i]+ "  ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue ob=new MyQueue(5);
		
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);
		ob.display();
		ob.enqueue(4);
		ob.enqueue(5);
		ob.display();
		
		ob.dequeue();
		ob.dequeue();
		ob.display();
		ob.dequeue();
		ob.display();
		ob.dequeue();
		ob.display();
		ob.dequeue();
		System.out.println();
		ob.display();
System.out.println();
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);
	
		ob.enqueue(4);
		ob.enqueue(5);
		System.out.println();
		ob.enqueue(6);
		ob.display();
	
	}

}
