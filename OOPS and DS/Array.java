package labAssignment;

import java.util.*;

public class Array {

	public static void main(String[] args) {
//     int a[]= {1,2,3,4,5,6};
//     for(int i=0;i<a.length;i++) {
//     System.out.print(a[i]+" ");
//       }
//     System.out.println();
		
		int arr[]=new int[6];
		int arr1[]=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int a=sc.nextInt();
		
		System.out.println("enter element");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
//      	arr=arr1;
//			if (arr[i] %2==0) {
//				System.out.println("even no"+arr[i]);
//			}
//			if (arr[i] %2==1) {
//				System.out.println("odd no  "+arr[i]);
//			}
		}
		
		for(int i=0;i<a;i++)
		{
			System.out.print(arr[i]+" ");
		} 
		
//           for(int i=a.length-1;i>=0;i--) {
//	         System.out.print(a[i]+" ");
//   }
	}
}

