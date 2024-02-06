//Assignment54:Create child class having relation with Abstract class and that abstract class is having relation with 2 different interfaces

package learning;
interface Manual
{
	abstract void manual();
	
}
interface Automation extends Manual
{
	abstract void auto();
}
abstract class Courses implements Automation
{
	abstract void Demo_all();
}
public class Demo_Assignment54 extends Courses
{

	public static void main(String[] args)
	{
		Demo_Assignment54 d54=new Demo_Assignment54();
		d54.manual();
		d54.auto();
		d54.Demo_all();

	}

	@Override
	public void auto() 
	{
		System.out.println("Fetch automation course details");
		
	}

	@Override
	public void manual() 
	{
		System.out.println("Fetch manual course details");
		
	}

	@Override
	void Demo_all() 
	{
	   System.out.println("Fetch all courses deatils");
		
	}

}
