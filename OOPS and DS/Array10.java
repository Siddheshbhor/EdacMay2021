package Practice;

public class Array10 {
	
	static int search(int arr[],int n, int x)
	{
		for(int i=0;i<n;i++)
		{
		if(arr[i]==x)
			return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[]= {20,4,6,52},x=6;
		System.out.println(search(arr,arr.length,x));
	}

}
