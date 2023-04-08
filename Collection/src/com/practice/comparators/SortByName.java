package com.practice.comparators;

import java.util.Comparator;

import com.practice.entity.Student;

public class SortByName implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) 
	{
		Student name1 = (Student)o1;
		Student name2 = (Student)o2;
		return name2.getName().compareTo(name1.getName());
	}

}
