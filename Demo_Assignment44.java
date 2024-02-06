//Assignment44:WAP for single level inheritance where gk method(child) is static and parent(selenium and java) are non static.
package learning;

class Demo1
{
	void selenium()
	{
		System.out.println("Impliment selenium logic");
	}
    void java()
    {
    	System.out.println("Impliment java logic");
    }
    

}

public class Demo_Assignment44 extends Demo1
{
	static void gk()
    {
    	System.out.println("Impliment gk logic");
    }	
	public static void main(String[] args)
	{
		Demo_Assignment44 d4=new Demo_Assignment44 ();
		d4.selenium();
		d4.java();
		gk();

	}

}
