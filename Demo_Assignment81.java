//Assignment81:"Find out number of char and number of digits in below string Rahul123"
package learning;

public class Demo_Assignment81 
{

	public static void main(String[] args) 
	{
		String name="rahul123";
		char c1[]=name.toCharArray();
		
		for(int i=0;i<name.length();i++)
		{
			boolean answer=Character.isDigit(c1[i]);
			if(answer==true)
			{
				System.out.println(c1[i]+" " +"It is digits:");
			}
			else
			{
				System.out.println(c1[i] +" "+"It is characters:");
			}
			
			
		}

	}

}
