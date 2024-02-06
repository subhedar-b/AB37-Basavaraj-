//Assignment76:Create an array of length 5. Find out the index of number 41 
package learning;

public class Demo_Assignment76
{
	static int i=0;

	public static void main(String[] args) 
	{
		int n[]= {21,31,41,51};
		int numbertocheck=41;
		
		for(i=0;i<=3;i++)
		{
			//System.out.println(n[i]);
			
		if(numbertocheck==n[i])
		{
			System.out.println("The index of given number  "+numbertocheck+" is:"+ i);
			break;
		}
		}
		
		if(numbertocheck!=n[i])
		{
			System.out.println("The given number is not present");
		}
		

	}

}
