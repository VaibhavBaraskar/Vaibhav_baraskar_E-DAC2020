package BasicsPrograms;

import java.util.Scanner;

class Link {
	public int iData;	
	public Link next;	
	public Link(int id){
		iData=id;	
	}	
	public void displayLink(){		
		System.out.print(" "+iData);
	}	
}

class LinkList {
	private Link first;
	public LinkList(){
		first=null;
	}	
	public boolean isEmpty(){
		return (first==null);
	}	
	public void insertFirst(int id){
		Link newLink=new Link(id);
		newLink.next=first;
		first=newLink;
	}	
	
	public void insertLast(int id) {
		Link current=first;
		while(current.next!=null){
			current=current.next;
		}	
		Link newLink=new Link(id);
		newLink.next=current;
		System.out.println(current.iData);
		newLink.next=null;
	}
	public Link deleteFirst(){
		Link temp=first;
		first=first.next;
		return temp;
	}	
	public void display(){		
		Link current=first;
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println();
	}
}
public class LL {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		LinkList l1=new LinkList();		
		while(true){
			System.out.println("1 for insert \n2 for delete \n3 for display \n4 for insert at last \n 5 for exit");
			System.out.println("Enter your choice:");
			switch(scan.nextInt()){
			case 1:	int i;
				i=scan.nextInt();
				l1.insertFirst(i);
				break;
			case 2:	l1.deleteFirst();
				break;
			case 3:	l1.display();
				break;
				
			case 4:int j;
			j=scan.nextInt();
				l1.insertLast(j);	
			break;
			default:	scan.close();
					System.exit(0);
			}
		}	
		
	}
}
