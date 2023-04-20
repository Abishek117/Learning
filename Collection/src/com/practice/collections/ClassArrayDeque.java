package com.practice.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class ClassArrayDeque
{
	public Deque<Integer> arrayDeque()
	{
		Deque<Integer> d = new ArrayDeque<>();
		d.add(3);
		d.add(8);
		d.add(4);
		d.add(3);
		d.add(1);
		d.add(9);
		d.add(7);
		d.add(2);
		d.add(5);
		d.add(6);
		d.add(9);
		
		
		d.addFirst(23);									//Inserts the specified element at the front of the deque.
		d.addLast(54); 									//Inserts the specified element at the end of the deque.
		//System.out.println(d.offerFirst(32)); 		//Inserts the specified element at the front of the deque. Returns true if the operation succeeds, and false if the deque is full.
		//System.out.println(d.offerLast(45));			//Inserts the specified element at the end of the deque. Returns true if the operation succeeds, and false if the deque is full.
		//System.out.println(d.removeFirst()); 			//Removes and returns the first element of the deque. Throws an exception if the deque is empty.
		//System.out.println(d.removeLast());  			//Removes and returns the last element of the deque. Throws an exception if the deque is empty.
		//System.out.println(d.pollFirst()); 			//Removes and returns the first element of the deque. Returns null if the deque is empty.
		//System.out.println(d.pollLast()); 			//Removes and returns the last element of the deque. Returns null if the deque is empty.
		//System.out.println(d.getFirst()); 			//Returns, but does not remove, the first element of the deque. Throws an exception if the deque is empty.
		//System.out.println(d.getLast()); 				//Returns, but does not remove, the last element of the deque. Throws an exception if the deque is empty.
		//System.out.println(d.peekFirst()); 			//Returns, but does not remove, the first element of the deque. Returns null if the deque is empty.
		//System.out.println(d.peekLast()); 			//Returns, but does not remove, the last element of the deque. Returns null if the deque is empty.
		//System.out.println(d.removeFirstOccurrence(3)); //Removes the first occurrence of the specified element from the deque. Returns true if the element was removed, and false if it was not present in the deque.
		//System.out.println(d.removeLastOccurrence(3));  //Removes the last occurrence of the specified element from the deque. Returns true if the element was removed, and false if it was not present in the deque.

		
		System.out.println(d);
		
		return d;
	}

}
