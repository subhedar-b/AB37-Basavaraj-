package learning;

public class Assignment1
{
    static char c;
    static int a;
    static int b;
   
   static void add()
   {
	   a=10;
	   b=20;
	   int sum=a+b;
	   System.out.println(sum);
   }
    void subtract()
   {
	   int a=10;
	   int b=20;
	   int sub=a-b;
	   System.out.println(sub);
   }
	public static void main(String[] args)
	{
		
	
		add();
		Assignment1 a1=new Assignment1();
		a1.subtract();

	}

}
