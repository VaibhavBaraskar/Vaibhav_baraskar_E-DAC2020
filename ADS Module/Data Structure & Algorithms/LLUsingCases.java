package BasicsPrograms;

import java.util.Scanner;

/*class Node
{
    int data;
    Node next;
    
    Node(int a)
    {
        data=a;
        next=null;
    }
}

*/






class Implement
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
        
        int count1=0;
        while(temp!=null)
        {
            temp=temp.next;
            count1++;
        }
        temp=head;
        
        if(count1>pos)
        {
            while(count<pos-1)
            {
                temp=temp.next;
                count++;
            }
            obj.next=temp.next;
            temp.next=obj;
        }
        else
            insertLast(data);
    }
    
    void show()
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
        
        int count1=0;
        while(temp!=null)
        {
            temp=temp.next;
            count1++;
        }
        temp=head;
        
        if(count1>pos)
        {
            while(count<pos)
            {
                prev=temp;
                temp=temp.next;
                count++;
            }
            prev.next=temp.next;
            temp=null;
        }
        else
            deleteLast();
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



public class LLUsingCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Implement obj = new Implement();
        
        Scanner sc=new Scanner(System.in);
        int option=0,item;
        
        while(option!=9)
        {
            System.out.println("\nSelection Operation: \n1. Add element at First.\n2. Add element at Last.\n3. Add element in between.\n4. Delete element at first Position.\n5. Delete element at last Position.\n6. Delete element at any Position.\n7. Show List elements.\n8. Size of LinkedList.\n9. EXIT");
            option=sc.nextInt();
            switch(option)
            {
                case 1:
                    System.out.print("\nEnter Element: ");
                    item=sc.nextInt();
                    obj.insertFirst(item);
                    break;
                    
                case 2:
                    System.out.print("\nEnter Element: ");
                    item=sc.nextInt();
                    obj.insertLast(item);
                    break;
                    
                case 3:
                    System.out.print("\nEnter Element: ");
                    item=sc.nextInt();
                    System.out.print("\nEnter Position: ");
                    int pos=sc.nextInt();
                    obj.insertMiddle(pos,item);
                    break;
                    
                case 4:
                    obj.deleteFirst();
                    break;
                    
                case 5:
                    obj.deleteLast();
                    break;
                    
                case 6:
                    System.out.print("\nEnter Position of Element: ");
                    int position=sc.nextInt();
                    obj.deleteMiddle(position);
                    break;
                    
                case 7:
                    obj.show();
                    break;
                    
                case 8:
                    obj.size();
                    break;
                    
                case 9:
                    break;
                    
                default:
                    System.out.println("Invalid choice!");
            }
        }
        
	}

}
