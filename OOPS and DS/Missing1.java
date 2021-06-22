package labAssignment;

public class Missing1 {

	public static void main(String[] args) {
		int a[]= {2,4,5,6,8,2,4,9};
		int xor1=a[0];
		for(int i=1;i<a.length;i++)
		{
			xor1=xor1^a[i];
		}
		int xor2=1;
		for(int i=2;i<=(a.length+1);i++)
		{
			xor2=xor2^i;
		}
	  System.out.println("missing no:"+(xor1 ^ xor2));
	}

}
