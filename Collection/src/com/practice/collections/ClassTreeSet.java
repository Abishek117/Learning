package com.practice.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class ClassTreeSet
{
	
	public TreeSet<String> treeSet()
	{
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3);
		tree.add(1);
		tree.add(6);
		tree.add(5);
		tree.add(2);
		tree.add(7);
		tree.add(7);
		tree.add(9);
		tree.add(1);
		
		//System.out.println(tree);
		
		TreeSet<String> tree1 = new TreeSet<String>();
		tree1.add("tyr");
		tree1.add("bgsdj");
		tree1.add("yeio");
		tree1.add("uetw");
		tree1.add("iopd");
		
		//System.out.println(tree1.first());			  //prints first element in a treeset
		//System.out.println(tree.last()); 				  //prints last element in a treest 
		//System.out.println(tree1.headSet("sfrtyuhn"));  //prints elements in a treeset that are less than a given element.the specified element can be any,like it may or may not be in a treeset 
		//System.out.println(tree1.tailSet("fgth"));	  //prints elements in a treeset that are less than a given element.the specified element can be any,like it may or may not be in a treeset
		//System.out.println(tree1.subSet("tyr","yeio")); //prints elements between those specified elements
		//System.out.println(tree1.descendingSet());	  //prints set in descending order
		//System.out.println(tree1.ceiling("tyr"));		  //prints the immediate next element in a treeset that which is greater than or equal to a given element.the specified element can be any,like it may or may not be in a treeset
		//System.out.println(tree1.floor("tyr"));		  //prints the immediate next element in a treeset that which is less than or equal to a given element.the specified element can be any,like it may or may not be in a treeset
		//System.out.println(tree1.higher("tyr"));		  //prints the immediate next element in a treeset that which is strictly greater than a given element.the specified element can be any,like it may or may not be in a treeset
		//System.out.println(tree1.lower("tyr"));		  //prints the immediate next element in a treeset that which is strictly greater than a given element.the specified element can be any,like it may or may not be in a treeset
		//System.out.println(tree1.pollFirst());		  //retrieves and removes first element in a set
		//System.out.println(tree1.pollLast());			  //retrieves and removes last element in a set

		System.out.println(tree1);
		
		/*
		Iterator<String> itr = tree1.descendingIterator();		//used to traverse in reverse order
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		
		/* // Using for loop
		String[] s = tree1.toArray(new String[tree1.size()]);
		for (int j = 0; j < s.length; j++)
		{
		  System.out.println(s[j]);
		}*/
		
		return tree1;
	}
	
}
