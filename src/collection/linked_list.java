package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linked_list {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		
		ll.add("my");
		ll.add(1);
		ll.add(null);
		ll.add('s');
		ll.add(null);
		ll.add("yes");
		ll.add(2, 99);
		
		System.out.println(ll);
		System.out.println("************************");
	//	System.out.println(ll.size());
		//System.out.println(ll.get(0));
		//System.out.println(ll.indexOf("yes"));
		
		
		Iterator l1 = ll.iterator();
		
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("************************");

		for(Object O:ll)
		{
			System.out.println(O);
		}
		
		
	}

}
