//Assignment49:Create a class and in this create interface as Amazon with login and logout methods also create child class and create relation between them 
package learning;
interface Amazon
{
  void login();
  void logout();
}

public class Demo_Assignment49 implements Amazon
{

	public static void main(String[] args)
	{
		Demo_Assignment49 d49=new Demo_Assignment49();
		d49.login();
		d49.logout();

	}

	@Override
	public void login() 
	{
		System.out.println("Implement login logic");
		
	}

	@Override
	public void logout() 
	{
		System.out.println("Implement logout logic");
		
	}

}
