package com.practice.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;



public class ClassArrayList implements Comparable
{
	
	public ArrayList<String> arrayList()
	{	
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("bc");
		arr.add("ac");
		arr.add("er");
		arr.add("tg");
		arr.add("tg");
		arr.add(1,"ui");
		
		
		
		//System.out.println(arr.add("qw"));
		//System.out.println(arr.size());				//returns size of the arrayList
		//System.out.println(arr.remove("tg"));			//removes given element and returns boolean
		//System.out.println(arr.remove(1));			//removes element in the given index position
		//System.out.println(arr.get(3));				//returns element in specified position
		//System.out.println(arr.set(2,"re"));			//updates element in specified position
		//System.out.println(arr.contains("bc"));		//returns boolean if arraylist havethe specified element
		//System.out.println(arr.hashCode());			//returns hashcode for the arraylist
		
		//Collections.sort(arr);								//sorts arraylist 
		//Collections.sort(arr,Collections.reverseOrder());		//sorts arraylist in reverse order
		//Collections.shuffle(arr);								//shuffles arraylist and returns it in random order
		
		System.out.println(arr);
		
		
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("bc");
		arr1.add("aaa");
		System.out.println(arr1);
		//arr1.removeAll(arr);							//removes elements on arr1 which are all present in arr
		//arr1.addAll(arr); 							//adds all element of arr1 to arr 
		arr1.retainAll(arr);							//returns elements in arr1 which are similar to elements in arr 
		//System.out.println(arr.containsAll(arr1));	//returns true if elements of arr1 presents in arr,else false
		//System.out.println(arr.hashCode());			//returns hashcode for the arraylist
		
		System.out.println(arr1);
		
		//ArrayList<String> arr2 = (ArrayList)arr1.clone();
		//System.out.println(arr2);
		
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(2);
		a1.add(7);
		a1.add(5);
		a1.add(4);
//		System.out.println(arr.remove(1));						//removes element in the given index position		
//		System.out.println(a1.remove(Integer.valueOf(4)));		//when arraylist contains integers,should use this method to remove the specified element and returns boolean
//		System.out.println(a1.get(2));
//		System.out.println(a1);
		
		
		/* --- Iterationg over ArrayList --- */
		
		/* // Using for loop  
		 for(int i = 0;i<arr.size();i++)
		 {
			 System.out.println(arr.get(i));
		 }
		 */

		/* // Using forEach
		for(String i : arr)
		{
			System.out.println(i);
		}
		*/
		
		/* //Using forEach method 
		arr.forEach(System.out::println);
		 */
		
		/* // Using Iterator Interface
		Iterator<String> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		
		/* // Using Lambda
		arr.forEach(i ->{System.out.print(i);});
		*/
		
		/* //Using Lambda in forEachRemaining()
		Iterator<String> it = arr.iterator();
		it.forEachRemaining(i -> {System.out.println(i);});
		*/
		
		/*// Using Streams
		arr.stream().forEach(i -> System.out.println(i));
		arr.stream().forEach(System.out::println);
		*/
		
		return arr;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	/*
	public ArrayList<Student> studList()
	{
		Student stud = new Student(101,"Abi",77.0);
		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(stud);
		System.out.println(arr);
		return arr;
		
	}
	*/
}

	
