/*06.Write a program that takes radius of a circle as input. Read the entered radius using
  Scanner class.Then calculate and print the area and circumference of the circle.*/

package assignment;

import java.util.Scanner;

public class Radius {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double Area = 3.14*r*r;
		System.out.println("Area:"+Area);
		double c = (2*3.14*r);
		System.out.println("circumference:"+c);
	}

}
