//Assignment100: WAP on Vector 
package learning;

import java.util.Collections;
import java.util.Vector;

public class Demo_Assignment100
{

	public static void main(String[] args)
	{
		Vector<Comparable> v=new Vector<Comparable>();
		v.add("basu");
		v.add("akshay");
		v.add("anand");
		v.add("prashanta");
		v.add("anand");
		Collections.sort(v);
		System.out.println(v);
		
		v.add(12);
		v.add(12.34);
		v.add(12.34567);
		v.add('c');
		v.add('d');
		v.add(true);
		v.add(false);
		v.add(null);
		System.out.println(v);

	}

}
