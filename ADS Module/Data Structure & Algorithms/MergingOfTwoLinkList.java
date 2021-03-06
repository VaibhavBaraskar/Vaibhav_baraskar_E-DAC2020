package SortingAlgo;


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
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
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
    
    int size()
    {
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        System.out.println("Size of List: "+count);
    return count;
    }
}


public class MergingOfTwoLinkList {
	static void mirage(Functions ob) {

//		Node temp=ob.head;
//		Node temp1=ob1.head;
//		while(temp.next!=null || temp1.next!=null) {
//			
//			System.out.print(temp.data+" ");
//			temp=temp.next;
//			
//			System.out.print(temp1.data+" ");
//			temp1=temp1.next;
//		}
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions ob=new Functions();
		 ob.insertFirst(50);
		 ob.insertFirst(40);
		 ob.insertFirst(30);
		 ob.insertFirst(20);
		 ob.insertFirst(10);
		
		 Functions ob1=new Functions();
		 
		 
		 ob1.insertFirst(100);
		 ob1.insertFirst(90);
		 ob1.insertFirst(80);
		 ob1.insertFirst(70);
		 ob1.insertFirst(60);
		 
		// mirage(ob,ob1);
		 System.out.println();
		 //ob.display();
		 //ob1.display();
		 
		 
		 Functions ob2=new Functions();
		 
		 Node findLast = null;
			//ob2.head=findLast;
			findLast=ob.head;
			while(findLast.next.next!=null) {
				//System.out.print(findLast.data+" ");
				ob2.insertFirst(findLast.data);
				findLast=findLast.next;
				
			}
			findLast.next=ob1.head.next;
			while(findLast.next!=null) {
				//System.out.print(findLast.data+" ");
				ob2.insertFirst(findLast.data);
				findLast=findLast.next;
				
			}
			ob2.insertFirst(findLast.data);
			
			System.out.println(findLast.data);
			System.out.println("*******************");
			
			ob2.display();
	System.out.println("****************************");
	
			mirage(ob2);
			
			
	}

}
