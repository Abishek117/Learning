package com.practice.collections;

import java.util.HashMap;
import java.util.HashSet;

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
		
		//hm.putIfAbsent(3, "tyu");											
		System.out.println(hm.putIfAbsent(4, "tyu"));		//If the specified key is not already associated with a value (or is mapped to null) associates it to the map and returns null, else returns the current associated value.	
		//System.out.println(hm.containsKey(9));			//This method is used to check whether a particular key is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.
		//System.out.println(hm.containsValue("khgw"));		//This method is used to check whether a particular value is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.
		//System.out.println(hm.get(11));					//This method is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key.
		//System.out.println(hm.hashCode());				//This method is used to generate a hashCode for the given map containing keys and values
		//System.out.println(hm.isEmpty());					//returns true if map is empty if map is empty else returns false
		//System.out.println(hm.keySet()); 					//returns set view of the keys in the map
		//System.out.println(hm.values());					//returns collection view of the values in the map
		//System.out.println(hm.getOrDefault(33,"fg"));		//returns specified value if key is not present in the map.if key is in the map,then returns the value for that key
		
		System.out.println(hm);
		
		return hm;
	}
	

}
