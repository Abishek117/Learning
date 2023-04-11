package com.practice.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

import com.practice.comparators.SortById;

public class ClassTreeMap
{
	public TreeMap<Integer, String> treeMap()
	{

		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(32,"er");
		tm.put(34,"ds");
		tm.put(43,"qqw");
		tm.put(23,"hfgd");
		tm.put(9,"rew");
		tm.put(2,"khg");
		tm.put(10,"vcx");
		
		SortById compareId = tm.compare();
		
		return tm;
		
	}

}
