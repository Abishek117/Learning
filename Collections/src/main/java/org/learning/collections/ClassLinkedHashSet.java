package org.learning.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ClassLinkedHashSet {

    public static void main(String[] args){
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(3);
        hs.add(2);
        hs.add(1);
        hs.add(4);
        hs.add(7);
        hs.add(9);
        hs.add(0);
        hs.add(6);

        System.out.println(hs);
        
        //addFirst(E), addLast(E)       - Adds an element specifically to the front or back.
        //getFirst(), getLast()         - Get the first or last element without an iterator.
        //removeFirst(), removeLast()   - Remove from the ends.

        // /*****All methods that are in used in hashset can also be applicable to linked hash maps*****/
    }
}
