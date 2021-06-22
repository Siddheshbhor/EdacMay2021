package Practice;

public class Stack1 {
	int S[];
	int top;
	int size;
	
	
	public Stack1(int s) 
	{
		size=s;
		S=new int [size];
		top=-1;
		
	}
	public void push(int j)
	{
		S[top++]=j;
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
		return top== -1;
	}
	public boolean isFull()
	{
		return (top == size-1);
	}
	public void display()
	{
		for(int i=0;i<size;i++) {
			System.out.println(S[i]);
		}
		
	}
	public static void main (String args[])
	{
		Stack s=new Stack(4);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
	//	System.out.println(s.pop()+" delet ele is");
		System.out.println(s.peek()+" peek ele is");
		System.out.println(s.isEmpty()+" empty");
		System.out.println(s.isFull()+" full");
		s.display();
	}
}
