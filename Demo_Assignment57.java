//Asignment57:Create a class with 4 different methods other than main method with 4 different access specifiers and try to access them within class
package learning;

public class Demo_Assignment57 
{
    public void add()
    {
    	int a=12;
    	int b=12;
    	int c=a+b;
    	System.out.println("public method");
    }
    private void sub()
    {
    	System.out.println("private  method");
    }
    protected void div()
    {
    	System.out.println("protected method");
    }
     void mul()
    {
    	System.out.println("default method");
    }
	public static void main(String[] args) 
	{
		
		Demo_Assignment57  a7=new Demo_Assignment57 ();
		a7.add();
		a7.sub();
		a7.div();
		a7.mul();

	}

}
