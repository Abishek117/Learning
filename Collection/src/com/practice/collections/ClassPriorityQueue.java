package com.practice.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ClassPriorityQueue 
{
	public Queue<Integer> priorityQueue()
	{
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(3);
		q.add(8);
		q.add(4);
		q.add(3);
		q.add(1);
		q.add(9);
		q.add(7);
		q.add(2);
		q.add(5);
		q.add(6);
		q.add(9);
		
		//System.out.println(q.peek());		//Returns the head (front) of the queue 
		//System.out.println(q.element());	//Performs the same operation as the peek () method. Throws NoSuchElementException when the queue is empty.
		//System.out.println(q.poll());		//Removes the head of the queue and returns it.If the queue is empty, it returns null.
		//System.out.println(q.remove());		//Removes the head of the queue and returns it. Throws NoSuchElementException if queue is empty.
		//System.out.println(q.offer(2));	 	//insert new element in a queue and returns boolean
		//System.out.println(q.size());  		//returns size of the queue
		
		System.out.println(q);
		
		
		return q;
		
	}
}
