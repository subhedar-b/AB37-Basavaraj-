//Assignment95:WAP to update the value of private variable username = "abc@grotechmind.com" to something else using getter and setter
package learning;

class Amazonnew
{
	private String Username="abc@grotchminds.com";
	
	public String getUsername()
	{
		return Username;
	}
	
	public void setUsername(String username)
	{
		this.Username=username;
	}
	}

public class Demo_Assignment95 
{

	public static void main(String[] args)
	{
		Amazonnew a1=new Amazonnew();
		System.out.println(a1.getUsername());
		a1.setUsername("basu@grotechminds.com");
	    System.out.println(a1.getUsername());	

	}

}
