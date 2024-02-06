//Write a non static method and call it inside the main method
package learning;

public class Demo_Assignment5 
{

	void Add()
	{
	  int a=4000;
	  int b=5000;
	  int sum=a+b;
	  System.out.println("Sum of two number"+sum);
		
	}
	public static void main(String[] args) 
	{
		Demo_Assignment5 a=new Demo_Assignment5();
		a.Add();
		

	}

}
