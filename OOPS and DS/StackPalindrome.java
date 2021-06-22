package Practice;

import java.util.Scanner;

	class Stack
	{
		private int S[];
		private int size;
		private int top;
		private char[] arr;
		
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
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string :");
		String str=sc.next();
		sc.close();
		
		int len=str.length();
		Stack stack=new Stack(len);
		for(int i=0;i<len;i++) {
			stack.push(str.charAt(i));
		}
		System.out.println(str);
		for(int i=0;i<len;i++) {
			if (stack.arr[stack.top] !=str.charAt(i)) {
				break;
			}
			stack.pop();
		}
		if(stack.isEmpty()) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
