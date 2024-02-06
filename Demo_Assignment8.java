//Create few constructor and call it in main method
package learning;

public class Demo_Assignment8 
{
	Demo_Assignment8()
	{
		System.out.println("Constructor");
		
	}
	Demo_Assignment8(int a)
	{
		System.out.println("Constructor1");
		
	}
	Demo_Assignment8(int a,int b)
	{
		System.out.println("Constructor2");
		
	}
      
	public static void main(String[] args) 
	{
		  new Demo_Assignment8();
	      new Demo_Assignment8(5);
	      new Demo_Assignment8(4,7);

	}

}
