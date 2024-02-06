//Write many non static method and call it inside the main method
package learning;

public class Demo_Assignment6 
{
	 public  void Addition()
	    {
	    	int a=2000;
	    	int b=3000;
	    	int sum=a+b;
	    	System.out.println("Additon of two numbers is:"+sum);
	    }
	    public void Subtraction()
	    {
	    	int a=2000;
	    	int b=3000;
	    	int sub=a-b;
	    	System.out.println("Subtraction of two numbers is:"+sub);
	    }
	    public void Multiplication()
	    {
	    	int a=2000;
	    	int b=3000;
	    	int mul=a*b;
	    	System.out.println("Multiplication of two numbers is:"+mul);
	    }
	    public void Division()
	    {
	    	int a=25;
	    	int b=5;
	    	int div=a/b;
	    	System.out.println("Division of two numbers is:"+div);
	    }
	public static void main(String[] args) 
	{
		Demo_Assignment6 a6=new Demo_Assignment6();
		a6.Addition();
		a6.Subtraction();
		a6.Multiplication();
		a6.Division();

	}

}
