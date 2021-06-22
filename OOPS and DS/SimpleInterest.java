/*08.Write a program to find the simple interest. Take the principle amount, rate of 
 * interest and time from user using Scanner class.
 */
package assignment;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	  float p=sc.nextFloat();
	  float r=sc.nextFloat();
	  float n=sc.nextFloat();
	  float SI=(p*r*n/100);
	  {
	  System.out.println("simple interest:"+SI);
	  }
sc.close();
	}
}