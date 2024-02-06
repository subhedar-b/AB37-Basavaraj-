/* Assignment74:"String = GroTechMinds
Output 1= All capital letters in String a
Output 2= All small letters in String b
and print both the strings" 
 * */
package learning;

public class Demo_Assignment74 
{

	public static void main(String[] args) 
	{
		String s= "GroTechMinds";
		String a=s.replaceAll("[A-Z]","");
		String b=s.replaceAll("[a-z]","");
		System.out.println(a);
		System.out.println(b);

	}

}
