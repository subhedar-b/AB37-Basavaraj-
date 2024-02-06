//Assignment93:Upcasting and downcasting Problem 5 as per Diagram during Class
package learning;

class New1
{
	void one()
	{
		System.out.println("Logic 1");
	}
}
class New2 extends New1
{
	void two()
	{
		System.out.println("Logic 2");
	}
}

public class Demo_Assignment93 extends New2
{
	void four()
	{
		System.out.println("Logic 4");
	}

	public static void main(String[] args) 
	{
	   New2 n2=new Demo_Assignment93();
	   n2.one();
	   n2.two();//upcasting
	  
	  Demo_Assignment93 d4=(Demo_Assignment93)n2;
	  d4.one();
	  d4.two();
	  d4.four();
	}
	class New3 extends New2
	{
		void three()
		{
			System.out.println("Logic3");
		}
	}

}
