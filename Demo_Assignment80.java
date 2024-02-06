//Asssignment80: Take any alphanumeric String and check at which position there is numeric value   
package learning;

public class Demo_Assignment80 
{

	public static void main(String[] args)
	{
		String s="grotechminds123";
		char c[]=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			boolean answer=Character.isDigit(c[i]);
			if(answer==true)
			{
				System.out.println(c[i] +"  It is a digit and its index position  is="+i);
			}
			else
			{
				System.out.println(c[i] +"  It is not a Digit and its index position is="+i);
			}
		}

	}

}
