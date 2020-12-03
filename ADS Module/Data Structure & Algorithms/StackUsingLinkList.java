package SortingAlgo;



class Node123
{
    int data;
    Node123 next;
    
    Node123(int a)
    {
        data=a;
        next=null;
    }
}

 class Functions1
{
    Node123 head;
    void insertFirst(int data)
    {
        Node123 obj=new Node123(data);
            obj.next=head;
            head=obj;
    }

    
    
    void display()
    {
        Node123 temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    
    void deleteFirst()
    {
        Node123 temp=head;
        head=temp.next;
        temp=null;
    }
    
    void deleteLast()
    {
        Node123 temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    
  
    
}

public class StackUsingLinkList {

	Functions1 ob=new Functions1();
	
	void push(int data) {
		ob.insertFirst(data);
	}
	
	void pop() {
		ob.deleteFirst();
	}
	
	void display() {
		ob.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackUsingLinkList obj=new StackUsingLinkList();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		
		obj.display();
		System.out.println();
		obj.pop();
		obj.display();
		System.out.println();
		obj.pop();
		obj.display();
	
	}

}
