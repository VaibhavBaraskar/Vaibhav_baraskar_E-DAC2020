package BasicsPrograms;

class Node
{
    int data;
    Node next;
    
    Node(int a)
    {
        data=a;
        next=null;
    }
}

 class Functions
{
    Node head;
    void insertFirst(int data)
    {
        Node obj=new Node(data);
            obj.next=head;
            head=obj;
    }
    
    void insertLast(int data)
    {
        Node obj=new Node(data);
        Node temp=head;
        
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=obj;
    }
    
    void insertMiddle(int pos, int data)
    {
        int count=1;
        Node obj=new Node(data);
        Node temp=head;
        
        while(count<pos-1)
        {
            temp=temp.next;
            count++;
        }
        obj.next=temp.next;
        temp.next=obj;
    }
    
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    
    void deleteFirst()
    {
        Node temp=head;
        head=temp.next;
        temp=null;
    }
    
    void deleteLast()
    {
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    
    void deleteMiddle(int pos)
    {
        int count=1;
        Node temp=head;
        Node prev=head;
        
        while(count<pos)
        {
            prev=temp;
            temp=temp.next;
            count++;
        }
        prev.next=temp.next;
        temp=null;
    }
    
    void size()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        System.out.println("Size of List: "+count);
    }
}

 class SingularLinkList  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Functions obj=new Functions();
        obj.insertFirst(10);
        obj.display();
        System.out.println(".");
        
        obj.insertFirst(15);
        obj.display();
        System.out.println(".");
        
        obj.insertFirst(20);
        obj.display();
        System.out.println(".");

        obj.insertLast(5);
        obj.display();
        System.out.println(".");
        
        obj.insertMiddle(3,12);
        obj.display();
        System.out.println(".");
        obj.insertLast(2);
        obj.display();
        System.out.println(".");
        obj.insertMiddle(5,7);
        obj.display();
        System.out.println(".");
        
        obj.deleteFirst();
        obj.display();
        System.out.println(".");
        
        obj.deleteLast();
        obj.display();
        System.out.println(".");
        
        obj.deleteMiddle(2);
        obj.display();
        System.out.println("**");
        
        obj.size();
	}

}
