package com.practice.main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		c1.arrayList();
		//cl.studList();
		
		ClassLinkedList c2 = new ClassLinkedList();
		//c2.linkedList();
		
		ClassHashSet c3 = new ClassHashSet();
		//c3.hashSet();
		
		ClassTreeSet c4 = new ClassTreeSet();
		//c4.treeSet();
		
		ClassHashMap c5 = new ClassHashMap();
		c5.hashMap();
		
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
		
		/* //Comparators
		ArrayList<Student> stud = new ArrayList<>();
		stud.add(new Student(107,"Manoj",98.00));
		stud.add(new Student(109,"Abi",78.00));
		stud.add(new Student(105,"Hari",78.00));
		
			SortById compareId = new SortById();
			Collections.sort(stud, compareId);
		
		//SortByName compareName = new SortByName();
		//Collections.sort(stud, compareName);
		
		Comparator<Student> compare = Comparator.comparing(Student::getMarks).thenComparing(Student::getId);
		Collections.sort(stud, compare);
		stud.forEach(i -> System.out.println(i));
		*/
	
		
		//SuperB sb = new SuperB(4);
				
		
	}

}
