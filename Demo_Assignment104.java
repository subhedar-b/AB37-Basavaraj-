//Assignment104:WAP on LinkedHashSet
package learning;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Demo_Assignment104 
{

	public static void main(String[] args) 
	{
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("basu");
		lh.add("basu");//Duplicate not allowed
		lh.add("akshay");
		lh.add("kiran");
	//	Collections.sort(lh); not allowed
		lh.add(12);
		lh.add(12.24);
		lh.add(true);
		lh.add(null);
		lh.add('a');
		System.out.println(lh);

	}

}
