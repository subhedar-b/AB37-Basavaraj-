//Assignment96: WAP to use getter and setter with int, char
package learning;
class Amazonnew1
{
	private int Username=12345;
	
	public int getUsername()
	{
		return Username;
	}
	
	public void setUsername(int username)
	{
		this.Username=username;
	}
	}

class Amazonnew2
{
	private char Username='b';
	
	public char getUsername()
	{
		return Username;
	}
	
	public void setUsername(char username)
	{
		this.Username=username;
	}
	}

public class Demo_Assignment96 
{

	
	public static void main(String[] args) 
	{
		Amazonnew1 a1=new Amazonnew1();
		System.out.println(a1.getUsername());
		a1.setUsername(54321);
	    System.out.println(a1.getUsername());
	    
	    Amazonnew2 a2=new Amazonnew2();
		System.out.println(a2.getUsername());
		a2.setUsername('s');
	    System.out.println(a2.getUsername());
	    
	    

	}

}
