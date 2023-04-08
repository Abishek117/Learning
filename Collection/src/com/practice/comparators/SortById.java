package com.practice.comparators;

import java.util.Comparator;

import com.practice.entity.Student;

public class SortById implements Comparator<Student>
{

	@Override
	public int compare(Student id1, Student id2)
	{
		if(id1.getId() > id2.getId())
		{
			return 1;
		}
		else if(id1.getId() < id2.getId())
		{
			return -1;
		}
		return 0;
		
	}
	

}
