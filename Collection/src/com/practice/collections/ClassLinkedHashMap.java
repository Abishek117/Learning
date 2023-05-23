package com.practice.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class ClassLinkedHashMap 
{
	public LinkedHashMap<Integer, String> linkedHashMap()
	{
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
		
		lhm.put(11,"Dsf");
		lhm.put(4,"ewr");
		lhm.put(21,"err");
		lhm.put(32,"hfgd");
		lhm.put(43,"wefc");
		lhm.put(2,"khg");
		lhm.put(10,"err");
	
		// /*****All methods that are in used in hashmaps can also be applicable to linked hash maps*****/ 
		
		
		//Since the LinkedHashMap makes use of Doubly LinkedList to maintain the insertion order, we can implement LRU Cache functionality by overriding the removeEldestEntry() method to impose a policy for automatically removing stale when new mappings are added to the map. This lets you expire data using some criteria that you define.
		int msize = 0;
		LinkedHashMap<Integer, String> lhm1 = new LinkedHashMap<Integer, String>()
		{
			protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest)		//map should remove its eldest entry.
			{
				return size() > 6;
			}
		};
		lhm1.putAll(lhm);
		
		System.out.println(lhm);
		System.out.println(lhm1);
		
		
		return lhm;
		
		
				
	}

}
