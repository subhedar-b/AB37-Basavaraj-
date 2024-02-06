/*Assignment68: "M1=""Software"";
M2=""Testing"";
Output should print as:SoftwareTesting in a vertical way like below
S
o
f
t
w
a
r
e
T
e
s
t
i
n
g
 * 
 * 
 */
package learning;

public class Demo_Assignment68 
{

	public static void main(String[] args)
	{
		String name="softwaretesting";
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i));
		}

	}

}
