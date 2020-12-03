package BasicsPrograms;

public class MyCircularQueue {

	private int front;
	private int rear;
	private int[] myQueue;
	private int size;
	private int deletedData;
	int count=0;
	
	MyCircularQueue(int size){
		front=-1;
		rear=-1;
		myQueue=new int[size];
		this.size=size;
	}
	
	boolean isFull() {
		return ((front== 0 && rear == size-1 )||(front==rear+1));
	}
	
	boolean isEmpty() {
		return front==-1;
	}
	
	
	void enqueue(int insertMe ) {
		if(!isFull()) {
			 if (front == -1)
			        front = 0;
			rear=(rear+1)%size;
			myQueue[rear]=insertMe;
			System.out.println(insertMe +" is inserted ");
		}else {
			System.out.println("-----QueueOverflow-----");
		}
	}
	
	void dequeue() {
	
			
			if (isEmpty()) {
			      System.out.println("Queue is empty");
			    } else {
			    	deletedData=myQueue[front];
			      if (front == rear) {
			        front = -1;
			        rear = -1;
			      } /* Q has only one element, so we reset the queue after deleting it. */
			      else {
			        front = (front + 1) % size;
			      }
			
		}
	}
	
	void display() {
		
		/*
		 * if(!isEmpty()) { System.out.println("Quere  is empty"); }
		 */
		for (int i : myQueue) {
			System.out.print(i+", ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCircularQueue ob=new MyCircularQueue(5);
		
		ob.enqueue(1);
		ob.enqueue(2);
		ob.enqueue(3);
		ob.enqueue(4);
		ob.enqueue(5);
		
		ob.display();
		ob.enqueue(6);
		ob.enqueue(7);
		ob.enqueue(8);
		ob.display();
		
		ob.dequeue();
		ob.display();
	}

}
