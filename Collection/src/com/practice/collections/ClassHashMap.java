package com.practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.practice.comparators.SortById;

public class ClassHashMap
{
	public HashMap<Integer,String> hashMap()
	{
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(11,"Dsf");
		hm.put(4,"ewr");
		hm.put(5,"err");
		hm.put(1,"hfgd");
		hm.put(9,"wefc");
		hm.put(2,"khg");
		hm.put(10,"err");
				
		
		//hm.putIfAbsent(3,"tyu");
		//System.out.println(hm.size());					//This method is used to return the number of key/value pairs available in the map
		//System.out.println(hm.putIfAbsent(8, "tyu"));		//returns null if key is not present in the map and adds specified key-value to the map(just like put method,but put methods overrides the existing with new value if the key is present.this method just avoids and returns null if key is present).if key is in the map,then returns the existing value for that key	
		//System.out.println(hm.getOrDefault(8,"fg"));		//returns specified value if key is not present in the map.if key is in the map,then returns the value for that key
		//System.out.println(hm.containsKey(9));			//This method is used to check whether a particular key is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.
		//System.out.println(hm.containsValue("khgw"));		//This method is used to check whether a particular value is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.
		//System.out.println(hm.get(11));					//This method is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key.
		//System.out.println(hm.hashCode());				//This method is used to generate a hashCode for the given map containing keys and values
		//System.out.println(hm.isEmpty());					//returns true if map is empty if map is empty else returns false
		//hm.clear();										//This method is used to clear and remove all of the elements or mappings from a specified Map collection.
		
		//System.out.println(hm.keySet()); 					//returns set view of the keys in the map
		//System.out.println(hm.values());					//returns collection view of the values in the map
		//System.out.println(hm.entrySet());				//returns set view of map
		Set hs1 = new HashSet<>(hm.keySet());				//converting map keys into set (can convert map values into any collection)
		List l1 = new ArrayList<>(hm.keySet());
		Set hs2 = new HashSet<>(hm.values());				//converting map values into set (can convert map values into any collection)
		List l2 = new ArrayList<>(hm.values());
		Set hs3 = new HashSet<>(hm.entrySet());				//converting map into set (can convert map values into any collection)
		List l3 = new ArrayList<>(hm.entrySet());
		//System.out.println(l3);
		
		System.out.println(hm);
		
		HashMap<Integer,String> hm1 = new HashMap<>();
		hm1.put(32,"er");
		hm1.put(34,"ds");
		hm1.put(43,"qqw");
		hm1.put(23,"hfgd");
		hm1.put(9,"rew");
		hm1.put(2,"khg");
		hm1.put(10,"vcx");
		
		//System.out.println(hm1.equals(hm));					//This method is used to check for equality between two maps. It verifies whether the elements of one map passed as a parameter is equal to the elements of this map or not
		//hm.putAll(hm);										//This method is used to copy all of the mappings from the specified map to this map.
		//System.out.println(hm1);
		
		/* //Iterating over maps 
		//Using enhanced for loop
		for(Map.Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		for(Integer m : hm.keySet())
		{
			System.out.println(m);
		}
		for(String m : hm.values())
		{
			System.out.println(m);
		}
		
		//Using Iterator
		Iterator<Map.Entry<Integer, String>> itr1 = hm.entrySet().iterator();        
        while(itr1.hasNext())
        {
             Map.Entry<Integer, String> m = itr1.next();
             System.out.println(m.getKey() + " " + m.getValue());
        }
        
        Iterator<Integer> itr2 = hm.keySet().iterator();        
        while(itr2.hasNext())
        {
        	 System.out.println(itr2.next());
        }
        
        Iterator<String> itr3 = hm.values().iterator();        
        while(itr3.hasNext())
        {
             System.out.println(itr3.next());
        }
        
        //Using forEach
        hm.forEach((k,v) -> System.out.println(k + " " + v));
		hm.keySet().forEach(k -> System.out.println(k));
		hm.values().forEach(k -> System.out.println(k));
		*/

		//compute()
		//computeIfAbsent()
		//computeIfPresent()		
		//merge
		//replaceAll

		return hm;
	}
	

}
