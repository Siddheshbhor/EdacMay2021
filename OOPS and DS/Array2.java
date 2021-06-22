package labAssignment;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
     System.out.println("enter elements");
     int a=sc.nextInt();
    
     int [] array  =new int [5];
     for(int i=0;i<a;i++)
     {
    	 array[i]=sc.nextInt();
     }
     
     
     for (int i=0;i<array.length;i++)
     {
    	 System.out.println(array[i]);
     }
     
     
	}

}
