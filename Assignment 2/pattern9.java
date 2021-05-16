class pattern9
{
  public static void main(String args[])
  { int n=64;
    for (int i=1;i<=5;i++)
	{
	  for (int j=5;j>=i;j--)
	  {
	   System.out.print(" ");
	  }
	  {
         for (int k=1;k<=i;k++)
          {
            System.out.print((char)(n+k)+" ");
          }
            System.out.println(" ");
      }
	  
	}
  }
}