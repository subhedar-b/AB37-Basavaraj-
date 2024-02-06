/*Assignment20: WAP with 3 methods main,static add and static subtract. Declare a and b as static global variables and initialize then in each method
and perform addition and subtraction*/
package learning;

public class Demo_Assignment20 
{
    static int a=200;
    static int b=700;
    static int c;
    static void add()
    {
    	c=a+b;
    	System.out.println("Addition is:"+c);
    }
    static void sub()
    {
    	c=a-b;
    	System.out.println("Substraction is:"+c);
    }
    
	public static void main(String[] args) 
	{
	  add();
	  sub();

	}

}
