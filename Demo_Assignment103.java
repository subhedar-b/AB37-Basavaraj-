//Assignmet103: WAP on HashSet 
package learning;

import java.util.HashSet;

public class Demo_Assignment103 
{

	public static void main(String[] args)
	{
		HashSet lh=new HashSet();
		lh.add("basu");
		lh.add("basu");//Duplicate not allowed
		lh.add("akshay");
		lh.add("kiran");
		//Collections.sort(lh); //not allowed
		lh.add(12);
		lh.add(12.24);
		lh.add(true);
		lh.add(null);
		lh.add('a');
		System.out.println(lh);

	}

}
