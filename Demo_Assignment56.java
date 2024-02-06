/*Assignment56:"Create child class having relation with interface(1st)
1st interface having relation with 2nd interface
2nd interface having relation with 3rd interface" */

package learning;
interface A
{
	void a();
}
interface B extends A
{
	void b();
}
interface C extends B
{
	void c();
}

public class Demo_Assignment56 implements C
{

	public static void main(String[] args)
	{
		Demo_Assignment56 d56=new Demo_Assignment56();
		d56.a();
		d56.b();
		d56.c();
	}

	@Override
	public void b() 
	{
		System.out.println("Interface b logic");
		
	}

	@Override
	public void a() 
	{
		System.out.println("Interface a logic");
		
	}

	@Override
	public void c() 
	{
		System.out.println("Interface c logic");
		
	}

}
