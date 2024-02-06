//Assignment106:WAP for return keyword for int and double  
package learning;

public class Demo_Assignment106 
{

	int add(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
	double substract(int a,double b)
	{
		double sub=a-b;
		return sub;
	}
	public static void main(String[] args) 
	{
	  Demo_Assignment106  d=new Demo_Assignment106();
	  d.substract(30,20);
	  d.add(20,40 );
	  System.out.println(d.substract(30,20));
	  System.out.println(d.add(20,40 ));

	}

}
