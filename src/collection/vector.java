package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add("Chirag");
		v.add(12);
		v.add(3.14);
		v.add('c');
		v.add(null);
		v.add(null);
		
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.contains(12));
		System.out.println(v.capacity());
		v.add(0, "ishaan");
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		System.out.println("************************************");

		
		for(Object o:v)
		{
			System.out.println(o);
		}
		
		System.out.println("************************************");
		
		Iterator it = v.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("************************************");

		ListIterator li = v.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("************************************");
		
		Enumeration enu = v.elements();
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
	}

}
