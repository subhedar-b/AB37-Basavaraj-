/*Assignment51:Create 1 child class having main method ,1 abstarct class having 1 abstract method and 1 concrete method and interface having abstarct 
method and create relation between child class->Abstract class->Interface*/
package learning;

interface Relation
{
  abstract	void info();
}

abstract class Abstract_Class implements Relation
{
	abstract void add();
	void sub()
	{
		System.out.println("sub logic");
	}
}

public class Demo_Assignment51 extends Abstract_Class
{

	public static void main(String[] args) 
	{
		Demo_Assignment51 d51=new Demo_Assignment51();
		d51.info();
		d51.add();
		d51.sub();
		

	}

	@Override
	void add()
	{
		System.out.println("Addition logic");
		
	}

	@Override
	public void info() 
	{
		System.out.println("Interface logic");
		
	}

}
