/* Assignment52:Create child class and 2 interfaces and create relation of child class with interface(1st) and relation of child class with interface(2nd) and achieve 
 * multiple level inheritance */
package learning;

interface Flipkart
{
	void login();
	
}
interface Two
{
	void logout();
}


public class Demo_Assignment52 implements Flipkart,Two
{

	public static void main(String[] args) 
	{
		Demo_Assignment52 d52=new Demo_Assignment52();
		d52.login();
		d52.logout();

	}

	@Override
	public void logout() 
	{
		System.out.println("login logic");
		
	}

	@Override
	public void login() 
	{
		System.out.println("logout logic");
		
	}

}
