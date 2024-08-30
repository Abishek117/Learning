package com.practice.main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import com.practice.collections.ClassArrayDeque;
import com.practice.collections.ClassArrayList;
import com.practice.collections.ClassHashMap;
import com.practice.collections.ClassHashSet;
import com.practice.collections.ClassLinkedHashMap;
import com.practice.collections.ClassLinkedList;
import com.practice.collections.ClassPriorityQueue;
import com.practice.collections.ClassTreeMap;
import com.practice.collections.ClassTreeSet;
import com.practice.comparators.SortById;
import com.practice.comparators.SortByName;
import com.practice.entity.Student;

public class Main
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ClassArrayList c1 = new ClassArrayList();
		//c1.arrayList();
		//cl.studList();
		
		ClassLinkedList c2 = new ClassLinkedList();
		//c2.linkedList();
		
		ClassHashSet c3 = new ClassHashSet();
		//c3.hashSet();
		
		ClassTreeSet c4 = new ClassTreeSet();
		//c4.treeSet();
		
		ClassHashMap c5 = new ClassHashMap();
		//c5.hashMap();
		
		ClassLinkedHashMap c6 = new ClassLinkedHashMap();
		//c6.linkedHashMap();
		
		ClassTreeMap c7 = new ClassTreeMap();
		//c7.treeMap();
		
		ClassPriorityQueue c8 = new ClassPriorityQueue();
		//c8.priorityQueue();
		
		ClassArrayDeque c9 = new ClassArrayDeque();
		//c9.arrayDeque();
		/* //Calculating hashcode and it's index
		System.out.println("Naveen".hashCode());
		int index = ("Naveen".hashCode() & (16-1));
		System.out.println(index);
		*/
		
		 //Comparators
		//----------------
//		ArrayList<Student> stud = new ArrayList<>();
//		stud.add(new Student(107,"Manoj",98.00));
//		stud.add(new Student(109,"Abi",78.00));
//		stud.add(new Student(105,"Hari",78.00));
//		stud.add(new Student());
//		//System.out.println(stud);
//		
//		SortById compareId = new SortById();
////		stud.sort(compareId);
////		System.out.println(stud);
//		Collections.sort(stud, compareId);
		
		//SortByName compareName = new SortByName();
		//Collections.sort(stud, compareName);
		
		
		Comparator<Student> compare = Comparator.comparing(Student::getMarks).thenComparing(Student::getId);
//    	Collections.sort(stud, compare);
		//stud.forEach(i -> System.out.println(i));
		
	
		
		//SuperB sb = new SuperB();
		SuperA sa = new SuperB(8);
		System.out.println(sa.a);
		System.out.println(sa.a);
		
	
		/*If you want to sort a Map based on its values rather than keys, 
		you can use the following approach. Unfortunately, Java's standard library doesn't provide a 
		direct method for sorting a Map by values, so you need to convert the Map to a List and then sort the List.*/
//		Map<String, Integer> map = new HashMap<>();
//        map.put("John", 30);
//        map.put("Alice", 25);
//        map.put("Bob", 35);
//        map.put("Diana", 28);
//
//        // Sort the map by values using a custom comparator
//        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());
//        sortedList.sort(Comparator.comparing(Map.Entry::getValue));
//
//        // Create a new LinkedHashMap to preserve the order of the sorted entries
//        Map<String, Integer> sortedMap = new LinkedHashMap<>();
//        for (Map.Entry<String, Integer> entry : sortedList) {
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }
//
//        // Display the sorted map
//        System.out.println("Original Map: " + map);
//        System.out.println("Sorted Map by Values: " + sortedMap);
    }

		
}

