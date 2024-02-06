//Assignments91: Upcasting and downcasting Problem 3 as per Diagram during Class
package learning;

class As91
{
	void add() 
	{
		System.out.println("Addition logic");
	}
}
class As91a extends As91
{
	void sub()
	{
		System.out.println("Substraction logic");
	}
}

public class Demo_Assignment91 extends As91a
{
   void div()
   {
	   System.out.println("division logic");
   }
	public static void main(String[] args) 
	{
		//////upcasting
		As91 a=new Demo_Assignment91();
		a.add();
		
		
		//a.div(); unable to access
		//a.sub();unable to access
		///Downcasting
		
		Demo_Assignment91 d=(Demo_Assignment91)a;
        d.sub();
        d.div();
        d.add();
		
		 

	}

}
