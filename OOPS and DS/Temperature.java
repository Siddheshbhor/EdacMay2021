/* 10.Write a program to convert temperature from Fahrenheit to Celsius. 
Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ] */
package assignment;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float f=sc.nextFloat();
		float c=5*(f-32)/9;
		System.out.println("Celcious :"+c);
		sc.close();
	}

}
