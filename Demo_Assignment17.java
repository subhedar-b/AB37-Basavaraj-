//Assignment17: WAP with 4 constructors and 1 IIB
package learning;

public class Demo_Assignment17 
{
	Demo_Assignment17 ()
	{
		System.out.println("COnstructor1");
	}
	Demo_Assignment17 (int a)
	{
		System.out.println("COnstructor2");
	}
	Demo_Assignment17 (int a , int b)
	{
		System.out.println("COnstructor3");
	}
	Demo_Assignment17 (String s)
	{
		
		int a=10;
		int b=23;
		int c=a+b;
		System.out.println("COnstructor4 with Sum is:"+c);
		
	}
	
	{
		System.out.println("I am your IIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("I am your main method");
         new Demo_Assignment17();	
         new Demo_Assignment17(2);
         new Demo_Assignment17(2,5);
         new Demo_Assignment17("Basu");
         

	}

}
