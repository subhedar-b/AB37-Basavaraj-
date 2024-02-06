//Assignment79: Take any alphanumeric String and find out which are numeric values and characters and print it 
package learning;

public class Demo_Assignment79 
{

	public static void main(String[] args) 
	{
		String s="basu1234";
		System.out.println("Character are:"+s.replaceAll("[0-9]", ""));
		System.out.println("Numerics are:"+s.replaceAll("[a-z]", ""));
		

	}

}
