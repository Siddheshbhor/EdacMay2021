package Practice;

import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of student");
		int n =sc.nextInt();
		
		int marks[]=new int[n];
		System.out.println("enter marks");
		for(int i =0;i<n;i++)
		{
		marks[i]=sc.nextInt();
		}
		int avgmarks=0;
		for(int i=0;i<n;i++)
		{
			avgmarks+=marks[i];
		}
		avgmarks /=n;
		System.out.println("avgmarks"+avgmarks);
		}

}
