/*
 * Write a program to print the roll number and average marks of 8 students in three 
 * subjects (each out of 100). The marks are entered by user.
 * */

package labAssignment;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		
		    int i;
		 
		    System.out.println("Enter number of subjects");
		 
		    Scanner sc=new Scanner(System.in);
		 
		    int n=sc.nextInt();
		 
		    int[] a=new int[n];
		 
		    double avg=0;
		 
		    System.out.println("Enter marks");
		 
		    for( i=0;i<n;i++)
		    {
		       a[i]=sc.nextInt();
		    }
		 
		    for( i=0;i<n;i++)
		    {
		      avg=avg+a[i];
		    }
		 
		    System.out.print("Average of (");
		 
		    for(i=0;i<n-1;i++)
		    {
		      System.out.print(a[i]+",");
		    }
		    System.out.println(a[i]+") ="+avg/n);
		  }
		

	}

