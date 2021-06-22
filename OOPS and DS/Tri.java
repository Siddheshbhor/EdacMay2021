//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 
//units by creating a class named 'Triangle' without any parameter in its constructor.

package labAssignment;

public class Tri {

	int Area;
	int Peri;
	 Tri(int b,int h)
	{
		 Area = b*h/2;
	}
    Tri(int b,int w,int h)
   {
	    Peri=b+w+h;
   } 
}
class Q9
{
    public static void main(String[] args) {
		Tri t1=new Tri(3,4);
		Tri t2=new Tri(3,4,5);
		
		 System.out.println("Area="+t1.Area+" "  +"  Perimeter=" +t2.Peri);
	}
	
}
