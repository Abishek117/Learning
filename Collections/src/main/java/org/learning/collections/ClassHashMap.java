package org.learning.collections;

import java.util.*;

public class ClassHashMap {

    public static void main(String[] args){
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(11,"Dsf");
        hm.put(4,"oiu");
        hm.put(5,"err");
        hm.put(1,"hfgd");
        hm.put(9,"wefc");
        hm.put(2,"khg");
        hm.put(10,"err");


        String s = hm.get(12);
        System.out.println(s);
        System.out.println(hm);

        //hm.putIfAbsent(3,"tyu");
        //System.out.println(hm.size());					//This method is used to return the number of key/value pairs available in the map
        //System.out.println(hm.putIfAbsent(6, "tyu"));		//returns null if key is not present in the map and adds specified key-value to the map(just like put method,but put methods overrides the existing with new value if the key is present.this method just avoids and returns null if key is present).if key is in the map,then returns the existing value for that key
        //System.out.println(hm.getOrDefault(8,"fg"));		//returns specified value if key is not present in the map.if key is in the map,then returns the value for that key
        //System.out.println(hm.containsKey(9));			//This method is used to check whether a particular key is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.
        //System.out.println(hm.containsValue("khgw"));		//This method is used to check whether a particular value is being mapped into the Map or not. It takes the key element as a parameter and returns True if that element is mapped in the map.
        //System.out.println(hm.get(11));					//This method is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. It returns NULL when the map contains no such mapping for the key.
        //System.out.println(hm.hashCode());				//This method is used to generate a hashCode for the given map containing keys and values
        //System.out.println(hm.isEmpty());					//returns true if map is empty if map is empty else returns false
        //System.out.println(hm.remove(2));					//removes key-value pair with specified key.returns removed value
        //hm.clear();										//This method is used to clear and remove all of the elements or mappings from a specified Map collection.
        //hm.replace(2, "kgf"); 							//used to replace the value of the specified key only if the key is previously mapped with some value.There is absolutely no difference in put and replace when there is a current mapping for the wanted key.You can use either, based on what is more readable to you
        //System.out.println(hm.replace(2,"kgf"));			//returns old value.specified value will replace old value in the map
        //hm.replaceAll((k,v)->v+"fg"); 						//replace all the values in map with newly computed value
        //System.out.println(hm.compute(5, (k,v)->v.toUpperCase()));  				//computes a new value and associates it with the specified key in the hashmap.the specified key should be in map
        //System.out.println(hm.computeIfPresent(20, (k,v)->v.concat("dfr")));		//computes a new value and associates it with the specified key if the key is already present in the hashmap.if the specified key is not present in the map,then returns null
        //System.out.println(hm.computeIfAbsent(6, k->"uyt"));						//computes a new value and associates it with the specified key if the key is not associated with any value in the hashmap..feels same like putIfAbsent?..difference is if the key already exists, they return the same thing, but if the key is missing, computeIfAbsent returns the computed value, while putIfAbsent return null..
        //System.out.println(hm.merge(10,"hjy",(v1,v2)->(v2)));	//merges a new key-value pair if the specified key is not present. if the specified key is present we can do any operations with those two values (value which is already in map for a specified key,and newly specified value)


        //System.out.println(hm.keySet()); 					//returns set view of the keys in the map
        //System.out.println(hm.values());					//returns collection view of the values in the map
        //System.out.println(hm.entrySet());				//returns set view of map.Each element of the set is a Map.Entry object, representing a key-value pair
        Set hs1 = new HashSet<>(hm.keySet());				//converting map keys into set (can convert map values into any collection)
        List l1 = new ArrayList<>(hm.keySet());
        Set hs2 = new HashSet<>(hm.values());				//converting map values into set (can convert map values into any collection)
        List l2 = new ArrayList<>(hm.values());
        Set hs3 = new HashSet<>(hm.entrySet());				//converting map into set
        List l3 = new ArrayList<>(hm.entrySet());			//converting map into list
        //System.out.println(l3);

        //System.out.println(hm);

        HashMap<Integer,String> hm1 = new HashMap<>();
        hm1.put(32,"er");
        hm1.put(34,"ds");
        hm1.put(43,"qqw");
        hm1.put(23,"hfgd");
        hm1.put(9,"rew");
        hm1.put(2,"khg");
        hm1.put(10,"vcx");


        //hm.putAll(hm);										//This method is used to copy all of the mappings from the specified map to this map.
        //System.out.println(hm1.equals(hm));					//This method is used to check for equality between two maps. It verifies whether the elements of one map passed as a parameter is equal to the elements of this map or not
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
             System.out.println(m);
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
		//hm.keySet().forEach(k -> System.out.println(k));
		//hm.values().forEach(k -> System.out.println(k));
		*/
        /*************************************************/
        /*
         * "Map.entry"
         *
         * - In Java, the Map.Entry interface represents a key-value pair within a Map
         * provides methods to access and manipulate the key and value associated with an entry.
         * - The Map.Entry interface has been available since Java 1.2.
         */
//		for(Map.Entry<Integer, String> m : hm.entrySet())
//		{
//			//m.setValue("hj");                           			//setting value or modifying value
//			//System.out.println(m.getKey() + " " + m.getValue());  //getting key and value
//			for(Map.Entry<Integer, String> m1 : hm1.entrySet()) {
//				System.out.println(m.equals(m1));					//compare key-value pairs.here checking whether key-value of the m is equal to the key-value pair of the m1
//			}
//		}



        /* "entrySet()"
         *
         * - entrySet() method is a part of the Map interface, and it returns a Set view of
         * the key-value pairs contained in the map.Each element in the set is a Map.Entry object representing a
         * - The primary goal of the entrySet() method in Java's Map interface is to provide a convenient way to
         * access and iterate over the key-value pairs (entries) contained within a map. It returns a Set view of the
         * entries, where each element in the set is a Map.Entry object representing a single key-value pair.
         * This method provides a convenient way to iterate over the entries of a map and perform various operations on them.
         * - If needed, you can convert the set of entries to other collections
         * using entrySet() is a common and convenient way to iterate over the key-value pairs of a Map,
         * - You can also use other methods provided by the Map interface, such as keySet()(iteration for keys) and values()(iteration on values)
         */


    }
}
