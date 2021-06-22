/*Write a program to shift every element of an array to
circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4
4 5 1 2 3
3 4 5 1 2
2 3 4 5 1
1 2 3 4 5 */


package labAssignment;

public class Array4 {

	public static void main(String[] args) {
       int []ar= {1,2,3,4,5};
       for (int j=0;j<ar.length;j++)
       {
       int temp=ar[ar.length-1];
       
      for(int i=ar.length-2;i>=0;i--)
      {
    	   ar[i+1]=ar[i];
      }   
      ar[0]=temp;
      for(int z:ar)
      {
    	  System.out.print(z+" ");
      }
      System.out.println();
    	  }
      }
      
}
