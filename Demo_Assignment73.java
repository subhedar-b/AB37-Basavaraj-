/*Assignment73: "WAP for below (You can take your name )
String = ""My Name Is Manish""
 Output : M N I M. 
After printing this remove all the spaces from the output and print it */

package learning;

public class Demo_Assignment73 
{

	public static void main(String[] args)
	{
		String s= "My Name Is Manish";
		String s2=s.replaceAll("[a-z]", "");
		System.out.println(s2);
		System.out.println(s2.replaceAll(" ",""));

	}

}
