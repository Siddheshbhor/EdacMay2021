package Practice;


class Node{
	Node next;
	int prev;
	int d;
	Node head=null;
	public String data;
	
	Node(int data){
	    
		data=d;
	    next=null;
	}

public class Ads {
	
	Node head;


public void insertfirst(int newdata) {
	Node newnode=new Node(newdata);
	newnode.next=head;
	head=newnode;
	if(head==null) {
		System.out.println("list empty");
	}
	
}
void display()
{
	Node n=head;
	while(n!=null) {
		System.out.println(n.data+" ");
		n=n.next;
	}
}

public void main(String args[])
{
	Ads a1=new Ads();
	
        a1.head=new Node(11);
	a1.insertfirst(4);
	a1.display();
}
}
}