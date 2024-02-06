//Create many static method and call in inside a main method
package learning;

public class Demo_Assignment4 
{
    public static void Addition()
    {
    	int a=2000;
    	int b=3000;
    	int sum=a+b;
    	System.out.println("Additon of two numbers is:"+sum);
    }
    public static void Subtraction()
    {
    	int a=2000;
    	int b=3000;
    	int sub=a-b;
    	System.out.println("Subtraction of two numbers is:"+sub);
    }
    public static void Multiplication()
    {
    	int a=2000;
    	int b=3000;
    	int mul=a*b;
    	System.out.println("Multiplication of two numbers is:"+mul);
    }
    public static void Division()
    {
    	int a=25;
    	int b=5;
    	int div=a/b;
    	System.out.println("Division of two numbers is:"+div);
    }
	public static void main(String[] args) 
	{
		 Addition();
		 Subtraction();
		 Multiplication();
		 Division();

	}

}
