package learning;

public class NonstaticMethod
{
	static void add()
			{
		      int a=10;
		      int b=20;
		      int sum=a+b;
		      System.out.println(sum);
		
			}
	static void subtract()
	{
      int a=100;
      int b=89;
      int sub=a-b;
      System.out.println(sub);

	}
	
	  void multiplication()
	{
      int a=10;
      int b=20;
      int mul=a*b;
      System.out.println(mul);

	}
	 void division()
	{
      int a=25;
      int b=5;
      int div=a/b;
      System.out.println(div);

	}

	public static void main(String[] args) 
	{
		add();
		subtract();
		NonstaticMethod n1=new NonstaticMethod();
	    n1.multiplication();
	    n1.division();
     
    
	}

}
