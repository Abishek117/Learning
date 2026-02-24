package org.learning.collections;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class ClassTreeMap {
    public static void main(String[] args){
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(32,"er");
        tm.put(34,"ds");
        tm.put(43,"qqw");
        tm.put(23,"hfgd");
        tm.put(9,"rew");
        tm.put(2,"khg");
        tm.put(10,"vcx");

        /* TreeMap has it own implementations for all the methods of Map. It results the same thing like HashMap but internal implementation is ototally different because it uses red-black tree internally.
           So please refer ClassHashMap class to know what are all methods it can have.
           Additionally below methods are used in it because it implements SortedMap and NavigableMap interface*/

        //System.out.println(tm.firstEntry());				//It returns the key-value pair having the least key
        //System.out.println(tm.firstKey()); 				//It returns the least key
        //System.out.println(tm.lastEntry()); 				//It returns the key-value pair having the greatest key
        //System.out.println(tm.lastKey()); 				//It returns the greatest key
        //System.out.println(tm.ceilingEntry(44));			//It returns the key-value pair having the first key, greater than or equal to the specified key, or null if there is no such key
        //System.out.println(tm.ceilingKey(23));			//It returns the key which is greater or equal to the specified key or null if there is no such key
        //System.out.println(tm.floorEntry(20));			//It returns the key-value pair having the first key, less than or equal to the specified key, or null if there is no such key
        //System.out.println(tm.floorKey(22));	 			//It returns the key which is less or equal to the specified key or null if there is no such key
        //System.out.println(tm.headMap(4));				//It returns the key-value pairs whose keys are strictly less than the specified Key.
        //System.out.println(tm.headMap(23, false));		//It returns the key-value pairs whose keys are less than or equal to (if inclusive is true) or strictly lesser than (if inclusive is false) specified Key.
        //System.out.println(tm.tailMap(4));				//It returns the key-value pairs whose keys are greater less than specified Key.
        //System.out.println(tm.tailMap(9, true));			//It returns the key-value pairs whose keys are greater than or equal to (if inclusive is true) or strictly greater than (if inclusive is false) specified Key.
        //System.out.println(tm.higherEntry(9));			//prints the immediate next key-value pair in a treemap which is strictly greater than a given element.the specified key-value pair can be any,like it may or may not be in a treemap
        //System.out.println(tm.higherKey(9));				//prints the immediate next key in a treemap which is strictly greater than a given element.the specified key pair can be any,like it may or may not be in a treemap
        //System.out.println(tm.lowerEntry(10));        	//prints the immediate next key-value pair in a treemap which is strictly less than a given element.the specified key-value pair can be any,like it may or may not be in a treemap
        //System.out.println(tm.lowerKey(9));				//prints the immediate next key in a treemap which is strictly less than a given element.the specified key pair can be any,like it may or may not be in a treemap
        //System.out.println(tm.subMap(10, 32));			//It returns key-value pairs whose keys range from fromKey to toKey(prints key-value pairs which is greaterthan or equal to specified fromkey and strictly less than tokey
        //System.out.println(tm.subMap(10,true,32,true));	//It returns key-value pairs whose keys range from fromKey to toKey(if true,then it is greater/less than or equal-to specified key..if false,then it is strictly greater/less than specified key
        //System.out.println(tm.pollFirstEntry());			//retrieves and removes first key-value in a map
//        System.out.println(tm.pollLastEntry());			//retrieves and removes last key-value in a map
//        System.out.println(tm.descendingMap());			//prints treemap in descending order
        //System.out.println(tm.descendingKeySet());			//prints keys in descending order

        System.out.println(tm);


        //treemap using custom comparator's logic
        TreeMap<Integer,String> tm1 = new TreeMap<>((s1, s2) -> {return Integer.compare(s2,s1);});
        tm1.put(32,"er");
        tm1.put(34,"ds");
        tm1.put(43,"qqw");
        tm1.put(23,"hfgd");
        tm1.put(9,"rew");
        tm1.put(2,"khg");
        tm1.put(10,"vcx");
        System.out.println(tm1);


        /* //Iterating
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
    }
}
