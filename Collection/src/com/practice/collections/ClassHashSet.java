package com.practice.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ClassHashSet
{
	public HashSet<Integer> hashSet()
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(3);
		hs.add(2);
		hs.add(1);
		hs.add(4);
		hs.add(7);
		hs.add(9);
		hs.add(0);
		hs.add(6);
	
		//System.out.println(hs.add(7));		//returns boolean
		//System.out.println(hs.contains(7));	//Used to check whether if an element is present in set and returns boolean.
		//System.out.println(hs.remove(4)); 	//Used to remove the element if it is present in set and returns boolean.
		//System.out.println(hs.isEmpty());		//Used to check whether the set is empty or not and returns boolean
		//System.out.println(hs.size()); 		//returns the size of the set
		//System.out.println(hs.hashCode());	//returns hashcode for the set 
		
		//System.out.println(hs);
		
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("abd");
		hs1.add("try");
		hs1.add("fgh");
		hs1.add("erty");
		hs1.add("erfv");
		hs1.add("ytufg");

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("qwe");
		hs2.add("rty");
		hs2.add("uio");
		hs2.add("asd");
		hs2.add("fgh");
		hs2.add("erty");
		//hs2.add("abd");
		//hs2.add("try");
		
		//System.out.println(hs2.removeAll(hs1));		//removes elements of hs1 if its present in hs2 and returns boolean
		//System.out.println(hs2.addAll(hs1));			//This method is used to append all of the elements from the mentioned collection to the existing set.The elements are added randomly without following any specific order.		
		//System.out.println(hs2.containsAll(hs1));		//This method is used to check whether the set contains all the elements present in the given collection or not.This method returns true if the set contains all the elements and returns false if any of the elements are missing.
		//hs2.retainAll(hs1);							//returns elements of hs1 which are present in hs2 
		//System.out.println(hs2.retainAll(hs1));			//returns elements of hs1 which are present in hs2 and returns boolean  
		
		System.out.println(hs1);
		

		
		
		
		
		
		

		/* // Iterate using for loop
		Integer[] num = hs.toArray(new Integer[hs.size()]);
		for (int j = 0; j < num.length; j++)
		{
		  System.out.println(num[j]);
		}
		*/

		
		
		
		
		return hs;
	}



}
