/*
 * Write a program to print the name, salary and date of joining of 10 employees in a
 *  company.Use array of objects.
 * */
package labAssignment;

public class Company {
	public static void main(String[] args) {
		
		employee e1=new employee("ram", 12000, "12/9/2019");
		employee e2=new employee("shyam", 13000, "12/8/2019");
		employee e3=new employee("pavan", 14000, "12/7/2019");
		employee e4=new employee("saurabh", 15000, "12/6/2019");
		employee e5=new employee("sid", 16000, "12/5/2019");
		employee e6=new employee("sachin", 17000, "12/4/2019");
		employee e7=new employee("shubham", 18000, "12/3/2019");
		employee e8=new employee("abhi", 19000, "12/2/2019");
		employee e9=new employee("akash", 20000, "12/1/2019");
		employee e10=new employee("vivek", 21000, "1/1/2019");
		
		for (int i = 0; i < employees.length; i++)
            System.out.println("Element at " + i + " : " +
            		employees[i].name +" "+ employees[i].salary +" "+ employees[i].dateOfJoining);
		
		
//		employee [] employees=new employee[10];
//		employees [0]=e1;
//		employees [1]=e2;
//		employees [2]=e3;
//		employees [3]=e4;    
//		employees [4]=e5;
//		employees [5]=e6;
//		employees [6]=e7;
//		employees [7]=e8;
//		employees [8]=e9;
//		employees [9]=e10;
		
		
//		for (employee e:employees)
//		{
//			System.out.println(e.name+" "+e.salary+" "+e.dateOfJoining);
//		}
	}
}

class employee
{
	String name;
	int salary;
	String dateOfJoining;
	
	public employee (String name,int salary,String dateOfJoining )
	{
	this.name=name;
	this.salary=salary;
	this.dateOfJoining=dateOfJoining;
	}
	
}
