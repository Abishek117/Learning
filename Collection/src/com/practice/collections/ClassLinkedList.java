package com.practice.collections;

import java.util.Collection;
import java.util.LinkedList;

public class ClassLinkedList 
{
	public LinkedList<String> linkedList()
	{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("aaa");
		ll.add("bbb");
		ll.add("ccc");
		ll.add("ddd");
		ll.add("eee");
		ll.add("fff");
		ll.add("ggg");
		ll.add(3,"hhh");
		
		//System.out.println(ll);
		
		//ll.remove(2);
		//ll.remove("ccc");
		
		
		/* Methods that are not in arrayList */
		ll.addFirst("yyy");
		ll.addLast("zzz");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
	
		System.out.println(ll);
		
		return ll;
		
	}

}
