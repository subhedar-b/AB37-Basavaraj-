//WAP with combination of SIB, IIB, main method, constructor
package learning;

public class Demo_Assignment15 
{
    static
    {
    	System.out.println("SIB1");
    }
    {
    	System.out.println("IIB1");
    }
    static
    {
    	System.out.println("SIB2");
    }
    {
    	System.out.println("IIB2");
    }
    static
    {
    	System.out.println("SIB3");
    }
    Demo_Assignment15 ()
    {
    	System.out.println("Constructor1");
    }
	
	public static void main(String[] args) 
	{
		System.out.println("Main method");
		new Demo_Assignment15();

	}

}
