package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class array_list {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList<>();
		
		al.add("Velociu");
		al.add(1);
		al.add('A');
		al.add(1);
		al.add(null);
		al.add(null);
		al.add(1.5);
		//al.remove('A'); Not getting result here
		
		System.out.println(al);
		int size1 = al.size();
		System.out.println(size1);
		
		System.out.println(al.isEmpty());
		System.out.println(al.contains('A'));
		System.out.println(al.get(3));
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("********************************");
		
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("********************************");

		for(Object o:al)
		{
			System.out.println(o);
		}
		
		System.out.println("********************************");
		
		ArrayList<String> als=new ArrayList<>();
		
		als.add("1");
		als.add("y");
		
		for(String s:als)
		{
			System.out.println(s);
		}

	}

}
