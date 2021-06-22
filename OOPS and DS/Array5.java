/*1. If the input array is [10, 12, 20, 30, 25, 40, 32, 31, 35, 50,
60], your program should be able to find that the
subarray lies between the indexes 3 and 8.
Output: 30,25,40,32,31,35
*/

package labAssignment;

public class Array5 {

	public static void main(String[] args) {
      int a[]= {10, 12, 20, 30, 25, 40, 32, 31, 35, 50,
    		  60};
     
      for(int i=3;i<=8;i++) {
    	     
    		  System.out.println(a[i]+ " ");
      }
		
	}

}
