package labAssignment;

 class Duplicate1 {

	public static void main(String[] args) {
		int x;
		int y;
		int arr[]= {1,2,3,4,6,7,8};
		int arr1[]= {3,5,8,9,16,17,18};
		System.out.println("duplicate elements are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.println(arr[i]);
				}
				
			}
		}
	}

}
