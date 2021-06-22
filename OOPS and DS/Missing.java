//How to find the missing number in an integer array of 1
//to 100?

package labAssignment;

public class Missing {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7,8,9};
		int sum=0;
		int elements=a.length+1;
		int total=(elements*(elements+1)/2);
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("missing no "+(total-sum));
	}

}
