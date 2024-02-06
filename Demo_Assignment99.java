//Assignment99: WAP on ArrayList 
package learning;

import java.util.ArrayList;
import java.util.Collections;

public class Demo_Assignment99 
{

	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("basu");
		a1.add("akshay");
		a1.add("anand");
		a1.add("prashanta");
		a1.add("anand");
		Collections.sort(a1);
		System.out.println(a1);
		
		a1.add(12);
		a1.add(12.34);
		a1.add(12.34567);
		a1.add('c');
		a1.add('d');
		a1.add(true);
		a1.add(false);
		a1.add(null);
		System.out.println(a1);


	}

}
