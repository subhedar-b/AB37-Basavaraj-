//Assignment83:Check if the String is Palindrome
package learning;

public class Demo_Assignment83 
{

	public static void main(String[] args)
	{
		String s="gadag";
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char reverse=s.charAt(i);
			s1=s1+reverse;
		}
		System.out.println(s1);
		if(s.equals(s1))
		{
			System.out.println("The given string is palindrome");
		}
		else
		{
			System.out.println("The give string is not palindrome");
		}

	}

}
