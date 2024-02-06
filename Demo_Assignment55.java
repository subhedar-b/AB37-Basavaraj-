/*Assignment55: "Create child class having relation with abstract class
that abstract class having relation with interface(1st) &
that interface(1st) having relation with another interface(2nd)" */

package learning;
interface First
{
   void first();	
}
interface Second extends First
{
	void second();
}
abstract class Abclass implements Second
{
	abstract void ab_method();
}
public class Demo_Assignment55 extends Abclass
{

	public static void main(String[] args) 
	{
		Demo_Assignment55 d55=new Demo_Assignment55();
		d55.first();
		d55.second();
		d55.ab_method();

	}

	@Override
	public void second() 
	{
		System.out.println("Implemnt Interface second logic");
		
	}

	@Override
	public void first() 
	{
		System.out.println("Implemnt Interface first logic");
		
	}

	@Override
	void ab_method() 
	{
		System.out.println("Implemnt abstract  logic");
		
	}

}
