package Practice;

import java.util.Scanner;

	class Stack
	{
		private int S[];
		private int size;
		private int top;
		private int[] arr;
		
		public Stack(int s)
		{
			size = s;
			S = new int[size];
			top =-1;
		}
		
		public void push(int j)
		{
			S[++top] = j;
		}
		
		 public int pop()
		 {
			 return S[top--];
		 }
		 
		 public int peek()
		 {
			 return S[top];
		 }
		 
		 public boolean isEmpty()
		 {
			 return (top == -1);//Underflow
		 }
		 
		 public boolean isFull()
		 {
			 return (top == size-1);//Overflow
		 }
		 
		 public void display()
		 {
			 for(int i=0;i<size;i++)
				 System.out.println(S[i]);
		 }
		 
		
	

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string :");
//		int str=sc.nextInt();
		
		Stack s1=new Stack(5);
		s1.push(12);
		s1.push(13);
		s1.push(14);
		//s1.display();
		System.out.println(s1.pop()+" pop");
		System.out.println(s1.peek()+" peek");
		System.out.println(s1.pop()+" pop");
		System.out.println(s1.pop()+" pop");
		System.out.println(s1.isEmpty()+" isEmpty");
		System.out.println(s1.isFull()+" isfull");
		s1.display();
//		s1.pop();
//		s1.display();
		
//		int len=str.length();
//		Stack stack=new Stack(len);
//		for(int i=0;i<len;i++) {
//			stack.push(str.charAt(i));
//		}
//		
//		for(int i=0;i<len;i++) {
//			if (stack.arr[stack.top] !=str.charAt(i)) {
//				break;
//			}
//			stack.pop();
//		
//		if(stack.isEmpty()) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("not palindrome");
//		}
	}
	}

