package list;

import java.util.Scanner;

public class EvenOdd {
	Node head;
	
	 class Node{
		int data;
		Node next;
		Node head=null;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public void insert(int data)
	{
		Node node = new Node(data);
		if(head==null) {
			head=node;
		}else {
			node.next=head;
			head=node;
		}
	}
	public void evenodd()
	{
		Node temp=head;
		while(temp!=null) {
		if(temp.data % 2==0) {
			System.out.print(temp.data+"-->");
		}temp=temp.next;	
	}
		temp=head;
		System.out.println();
		while(temp!=null) {
			if(temp.data % 2== 1) {
				System.out.print(temp.data+"-->");
				
			}temp=temp.next;
		}
		//System.out.println(temp);
	}
	
	
	public void display(){
		Node temp=head;
		while(temp != null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		//System.out.println(temp);
	}
	public static void main (String args[])
	{
		EvenOdd e1=new EvenOdd();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element for link list");
		//e1.insert(4);
		//e1.display();
		//String i = null;
		int no =sc.nextInt();
		for(int i=1;i<=no;i++)
		{
		System.out.print("Enter Element "+i+": ");
		int inp=sc.nextInt();
		e1.insert(inp);
		//e1.display();
		System.out.println("Input:");
		e1.display();
		System.out.println("Output:");
		e1.evenodd();
		}
	
	}
}
