/*Assignment50:Create 1 child class and 2 interfaces ( both having 2-2 abstract methods in it) and create relation between 
child class->interface(1st)->interface(2nd) */
package learning;
interface Logic1
{
	void login();
	void auth();
}
interface Logic2 extends Logic1
{
	void logout();
	void signin();
	
}
public class Demo_Assignment50 implements Logic2
{

	public static void main(String[] args)
	{
		Demo_Assignment50 d50=new Demo_Assignment50();
		d50.login();
		d50.logout();
		d50.auth();
		d50.signin();

	}

	@Override
	public void login()
	{
		System.out.println("Implement login logic");
		
	}

	@Override
	public void auth() 
	{
		System.out.println("Implement auth logic");
		
	}

	@Override
	public void logout() 
	{
		System.out.println("Implement logout logic");
		
	}

	@Override
	public void signin() 
	{
		System.out.println("Implement signin logic");
		
	}

}
