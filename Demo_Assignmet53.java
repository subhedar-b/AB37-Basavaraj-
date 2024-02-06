/* Assignment53:Do everything same as Assignment 52 but only with 4 interfaces instead of 2 */
package learning;
interface Jio
{
	void login();
}
interface Amazon1
{
	void logout();
}
interface Flipkart1
{
	void auth();
}
interface Skill
{
	void signin();
}
public class Demo_Assignmet53 implements Skill,Flipkart1,Amazon1,Jio
{

	public static void main(String[] args)
	{
		Demo_Assignmet53 d53=new Demo_Assignmet53();
		 d53.login();
		 d53.logout();
		 d53.auth();
		 d53.signin();

	}

	@Override
	public void login()
	{
		System.out.println("login logic");
		
	}

	@Override
	public void logout() 
	{
		System.out.println("logout logic");
		
	}

	@Override
	public void auth() 
	{
		System.out.println("auth logic");
		
	}

	@Override
	public void signin() 
	{
		System.out.println("signin logic");
		
	}

}
