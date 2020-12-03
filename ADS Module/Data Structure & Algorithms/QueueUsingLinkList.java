package SortingAlgo;



class Node1
{
    int data;
    Node1 next;
    
    Node1(int a)
    {
        data=a;
        next=null;
    }
}

 class Functions2
{
    Node1 head;
    
    void insertFirst(int data)
    {
        Node1 obj=new Node1(data);
            obj.next=head;
            head=obj;
    }
       
    void display()
    {
        Node1 temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    
    void deleteLast()
    {
        Node1 temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    
   
  
}

public class QueueUsingLinkList {

	Functions2 ob=new Functions2();
	
	void enqueue(int data) {
		ob.insertFirst(data);
	}
	
	void dequeue() {
		ob.deleteLast();
	}
	
	void display() {
		ob.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLinkList obj=new QueueUsingLinkList();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		
		obj.display();
		
		System.out.println();
		obj.dequeue();
		obj.display();
		System.out.println();
		obj.dequeue();
		obj.display();
		
	}

}
