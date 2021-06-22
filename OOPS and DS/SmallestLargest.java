/* How to find the largest and smallest number in an unsorted
array?*/

package labAssignment;

public class SmallestLargest {
	public static void main(String[] args) {
		 int ar[]= {23,54,56,34,95,23};
		    int i=0;
		    int large=ar[i];
		    int small=ar[i];
		    for (i=1;i<ar.length;i++)
		    {
		    if (ar[i]>large)
		    
		    	large=ar[i];
		    
		    if (ar[i]<small)
		    
		    	small=ar[i];
		    
		    
		    }
		    System.out.println(large);
		    System.out.println(small);
		}
	}
   

