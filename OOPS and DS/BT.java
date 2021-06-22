package Practice;

public class BT {
	Node root;
	static class Node{
		int data;
		Node left,right;
		
		Node(int d)
		{
			data=d;
			left=right=null;
		}
	}
	 BT()
	{
		root=null;
	}
	BT(int d)
	{
		root=new Node(d);
	}
	void Inorder(Node node)
	{
		if(node == null)
			return;
		Inorder(node.left);
		System.out.print(node.data+" ");
		Inorder(node.right);
	}
	void Preorder(Node node)
	{
		if(node == null)
			return;
		System.out.print(node.data+" ");
		Preorder(node.left);
		Preorder(node.right);
	}
	void Postorder(Node node)
	{
		if(node == null)
			return;
		
		Postorder(node.left);
		Postorder(node.right);
		System.out.print(node.data+" ");
	}
	void Inorder()
	{
		Inorder(root);
	}
	void Preorder()
	{
		Preorder(root);
	}
	void Postorder()
	{
		Postorder(root);
	}
	public static void main(String[] args) {
		BT t1=new BT();
		t1.root=new Node(11);
		t1.root.left=new Node(12);
		t1.root.right=new Node(13);
		t1.root.left.left=new Node(14);
		t1.root.left.right=new Node(15);
		
		System.out.println("Tree Traversal:");
		t1.Inorder();
		System.out.println();
		t1.Preorder();
		System.out.println();
		t1.Postorder();
		System.out.println();
	}

}
