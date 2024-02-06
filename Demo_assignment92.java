//Assignment92:Upcasting and downcasting Problem 4 as per Diagram during Class
package learning;

class Upcasting3
{
	void upcast3()
	{
		System.out.println("Upcast3 logic");
	}
}

class Upcasting2 extends Upcasting3
{
   void upcast2()
   {
	 System.out.println("Upcast2 logic");
   }
}

class Upcasting1 extends Upcasting2
{
   void upcast1()
   {
	 System.out.println("Upcast1 logic");
   }
}


public class Demo_assignment92 
{

	void upcast()
	{
		System.out.println("upcast logic");
	}
	public static void main(String[] args) 
	{
		Upcasting2 u2=new Upcasting1();
		 u2.upcast2();
		 u2.upcast3();//////upcasting
		/* u2.upcast();
		 * u2.upcast1()....unable to access
		 */
       //Down casting
		 Upcasting1 u1=(Upcasting1)u2;
		 u1.upcast1();
		 u1.upcast2();
		 u1.upcast3();
		 //u1.upacast();unamble to access
		 
	}

}
